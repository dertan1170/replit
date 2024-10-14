import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * DO NOT MODIFY: a writable 2-D grid of spaces and items.
 * 
 * @author Orion Smith
 *
 * @version 1.1, 11/29/2020 
 *    -modifications specific to ArrayPlotter lab version
 *          1.0, 11/28/1919 
 *    -initial version created for Console Dodgem
 *
 * License Information: This class is free software; you can
 * redistribute it and/or modify it under the terms of the GNU General
 * Public License as published by the Free Software Foundation.
 *
 * This class is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */
public class PlayGrid {
  private int width;
  private int height;
  private int heightOffset;
  private PlaySpace[][] spaces;
  private boolean[] dirtyRows;
  private ANSI writer;
  private boolean anyRowsDirty;

  // PIVs specific to ArrayPlotter
  private boolean[][] activeSpaces;
  private LinkedList<boolean[][]> futureStates;
  private final String BGCOLOR = ANSI.BACKGROUND_BRIGHTYELLOW;

  public PlayGrid(int inWidth, int inHeight, int inHeightOffset, ANSI inWriter) {
    width = inWidth;
    height = inHeight;
    heightOffset = inHeightOffset;
    spaces = new PlaySpace[height][width];

    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        spaces[row][col] = new PlaySpace(col, row, BGCOLOR, "  ");
      }
    }

    // specific to ArrayPlotter
    activeSpaces = new boolean[height][width];
    futureStates = new LinkedList<boolean[][]>();

    dirtyRows = new boolean[height];
    java.util.Arrays.fill(dirtyRows, true);
    anyRowsDirty = true;
    writer = inWriter;
  }

  // next 3 methods specific to ArrayPlotter
  /**
   * push an update into the futureStates queue
   */
  public int update(boolean[][] newActiveSpaces) {
    // validation on new array copy
    if (newActiveSpaces == null)
      throw new IllegalArgumentException("null input");
    if (activeSpaces.length != newActiveSpaces.length)
      throw new IllegalArgumentException("wrong # rows");

    int numChanged = 0;
    int numChecked = 0;
    boolean[][] checkSpaces = activeSpaces;
    boolean[][] cloneSpaces = new boolean[activeSpaces.length][activeSpaces[0].length];

    for (int r = 0; r < checkSpaces.length; r++) {
      if (checkSpaces[r].length != newActiveSpaces[r].length)
        throw new IllegalArgumentException("wrong # cols on row " + r);
      for (int c = 0; c < checkSpaces[r].length; c++) {
        numChecked++;
        cloneSpaces[r][c] = newActiveSpaces[r][c];
        if (newActiveSpaces[r][c]) {
          numChanged++;
        }
        // now, clear the original passed back to the caller
        // this lets us detect which cells are activated each time
        newActiveSpaces[r][c] = false;
      }
    }

    if (numChanged > 0) {
      futureStates.add(cloneSpaces);
    }
    
    return numChanged;
  }

  /**
   * Accessor for how many future states exist right now
   */
  public int getNumFutureStates() {
    return futureStates.size();
  }

  /**
   * move to the next available state, if one is available
   */
  public boolean next() {
    if (futureStates.size() > 0) {
      boolean[][] newActiveSpaces = futureStates.pop();
      for (int r = 0; r < activeSpaces.length; r++) {
        for (int c = 0; c < activeSpaces[r].length; c++) {
          if (newActiveSpaces[r][c] && activeSpaces[r][c]) {
            // special case: cell was already "activated"
            // force a pause, this is mostly a problem
            writer.stopCharInput();
            writer.writeRow(writer.getMaxRows() - 1, "Collision (already activated) at r=" + r + ", c=" + c + ": press enter to continue");
            Scanner pauseScan = new Scanner(System.in);
            pauseScan.nextLine();
            pauseScan = null;
            writer.writeRow(writer.getMaxRows() - 1, "");
            writer.startCharInput();
          }
          if (newActiveSpaces[r][c]) {
            anyRowsDirty = true;
            dirtyRows[r] = true;

            if (newActiveSpaces[r][c]) {

              spaces[r][c].setSpaceColor(ANSI.BACKGROUND_BLUE);
              // add an indicator that this space has flipped
              spaces[r][c].addItem(new PlayItem(c, r, ANSI.TEXT_BRIGHTWHITE, "<>", this));
              activeSpaces[r][c] = newActiveSpaces[r][c];
            } 
          } else {
            // check if we need to clear the space
            if (spaces[r][c].getItems().size() > 0) {
              // previously activated: eliminate marker
              clearSpace(c, r);
            }
          }
        }
      }
      return true;
    }
    return false;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public boolean getAnyRowsDirty() {
    return anyRowsDirty;
  }

  public PlaySpace findSpace(int x, int y) {
    if (x < width && x >= 0 && y < height && y >= 0) {
      return spaces[y][x];
    } else {
      throw new IllegalArgumentException("Index out of bounds.");
    }
  }

  public ArrayList<PlayItem> clearSpace(int x, int y) {
    if (x < width && x >= 0 && y < height && y >= 0) {
      ArrayList<PlayItem> out = new ArrayList<PlayItem>();
      out.addAll(spaces[y][x].getItems());
      spaces[y][x].getItems().clear();
      anyRowsDirty = true;
      dirtyRows[y] = true;
      return out;
    } else {
      throw new IllegalArgumentException("Index out of bounds.");
    }
  }

  public void writeDirtyRows() {
    for (int i = 0; i < height; i++) {
      if (dirtyRows[i]) {
        writeRow(i);
        dirtyRows[i] = false;
      }
    }
  }

  public void writeRow(int rowIndex) {
    StringBuilder out = new StringBuilder();
    for (int col = 0; col < spaces[rowIndex].length; col++) {
      // utilize the toString
      out.append(spaces[rowIndex][col]);
    }
    writer.writeRow(rowIndex + heightOffset, out.toString());
  }

  public void placeItem(PlayItem item, int newX, int newY) {
    item.setX(newX);
    item.setY(newY);
    spaces[newY][newX].addItem(item);

    // make sure the row is dirty
    dirtyRows[newY] = true;

    anyRowsDirty = true;
  }

  public void moveItem(PlayItem item, int newX, int newY) {
    // remove from existing play space
    spaces[item.getY()][item.getX()].getItems().remove(item);

    // old row is dirty
    dirtyRows[item.getY()] = true;

    item.setX(newX);
    item.setY(newY);

    // add to new space
    spaces[newY][newX].addItem(item);

    // new row is dirty
    dirtyRows[newY] = true;

    anyRowsDirty = true;
  }

  public PlayItem removeItem(PlayItem item, int atX, int atY) {
    // remove from existing play space
    spaces[item.getY()][item.getX()].getItems().remove(item);

    // old row is dirty
    dirtyRows[item.getY()] = true;

    item.setX(-1);
    item.setY(-1);

    anyRowsDirty = true;

    return item;
  }

}