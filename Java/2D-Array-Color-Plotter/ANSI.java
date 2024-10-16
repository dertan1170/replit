import java.io.IOException;

/**
 * A class for performing console output using the ANSI
 * character codes to navigate and alter screen contents,
 * as well as changing colors of both background and
 * foreground of text.
 * 
 * @author Orion Smith
 *
 * @version 1.1, 11/28/2020
 *   -add more colors
 * version 1.0, 11/05/2019
 *   -initial version
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
public class ANSI {
  public static final String ANSI_RESET = "\u001B[0m";

  public static final String TEXT_BLACK = "\u001B[30m";
  public static final String TEXT_RED = "\u001B[31m";
  public static final String TEXT_GREEN = "\u001B[32m";
  public static final String TEXT_YELLOW = "\u001B[33m";
  public static final String TEXT_BLUE = "\u001B[34m";
  public static final String TEXT_PURPLE = "\u001B[35m";
  public static final String TEXT_CYAN = "\u001B[36m";
  public static final String TEXT_WHITE = "\u001B[37m";

  public static final String TEXT_BRIGHTBLACK = "\u001B[90m";
  public static final String TEXT_BRIGHTRED = "\u001B[91m";
  public static final String TEXT_BRIGHTGREEN = "\u001B[92m";
  public static final String TEXT_BRIGHTYELLOW = "\u001B[93m";
  public static final String TEXT_BRIGHTBLUE = "\u001B[94m";
  public static final String TEXT_BRIGHTPURPLE = "\u001B[95m";
  public static final String TEXT_BRIGHTCYAN = "\u001B[96m";
  public static final String TEXT_BRIGHTWHITE = "\u001B[97m";

  public static final String BACKGROUND_BLACK = "\u001B[40m";
  public static final String BACKGROUND_RED = "\u001B[41m";
  public static final String BACKGROUND_GREEN = "\u001B[42m";
  public static final String BACKGROUND_YELLOW = "\u001B[43m";
  public static final String BACKGROUND_BLUE = "\u001B[44m";
  public static final String BACKGROUND_PURPLE = "\u001B[45m";
  public static final String BACKGROUND_CYAN = "\u001B[46m";
  public static final String BACKGROUND_WHITE = "\u001B[47m";
  public static final String BACKGROUND_BRIGHTYELLOW = "\u001B[103m";
  public static final String BACKGROUND_BRIGHTBLUE = "\u001B[104m";
  
  // instance variables
  private int currentRow;
  private int maxRows;
  private String[] textRows;
  private boolean rawMode;

  /*
   * Constructor takes in a number of rows to keep track of,
   * since this class is meant to simulate a fixed-height
   * display.
   */
  public ANSI(int height) {
    currentRow = 0;
    maxRows = height;
    textRows = new String[maxRows];
    for (int i = 0; i < maxRows; i++) {
      textRows[i] = "";
    }
    rawMode = false;
  }

  /*
   * Accessor for maxRows
   */
  public int getMaxRows() {
    return maxRows;
  }

  /*
   * Accessor for currentRow
   */
  public int getCurrentRow() {
    return currentRow;
  }

  /*
   * Find out if the shell is in raw character input mode
   */
  public boolean getRawMode() {
    return rawMode;
  }

  /*
   * Find the cached text at smoe row
   */
  public String getRow(int rowIndex) {
    if (rowIndex >= maxRows) {
      throw new IllegalArgumentException("rowIndex too high");
    }
    return textRows[rowIndex];
  }

  /*
   * Tell the shell to start raw character input mode
   */
  public void startCharInput() {
    try {
      String[] cmd = { "/bin/sh", "-c", "stty raw -echo </dev/tty" };
      Runtime.getRuntime().exec(cmd).waitFor();
      rawMode = true;
    } catch (Exception e) {
      System.out.println("Exception in startCharInput: " + e);
    }

  }

  /*
   * Tell the shell to return to buffered input mode
   */
  public void stopCharInput() {
    try {
      String[] cmd = new String[] { "/bin/sh", "-c", "stty sane </dev/tty" };
      Runtime.getRuntime().exec(cmd).waitFor();
      rawMode = false;
    } catch (Exception e) {
      System.out.println("Exception in stopCharInput: " + e);
    }

  }

  /*
   * Go to a row and push text into it.
   * @param rowContents should not have newline characters
   */
  public void writeRow(int rowIndex, String rowContents) {
    if (rowIndex >= maxRows) {
      throw new IllegalArgumentException("rowIndex too high");
    }
    textRows[rowIndex] = rowContents;
    navigateToRow(rowIndex);
    // clear the existing line
    System.out.print("\u001B[2K");
    // write the new text
    System.out.print(rowContents);
    // go to the last row
     navigateToRow(maxRows);

    System.out.flush();
  }

  /*
   * Bring a row back to its cached value
   */
  public void restoreRow(int rowIndex) {
    if (rowIndex >= maxRows) {
      throw new IllegalArgumentException("rowIndex too high");
    }
    navigateToRow(rowIndex);
    // clear the existing line
    System.out.print("\u001B[2K");
    // write the text
    System.out.print(textRows[rowIndex]);
    System.out.flush();
  }

  /*
   * Go to a row and wipe away text
   */
  public void clearRow(int rowIndex) {
    if (rowIndex < 0) {
      throw new IllegalArgumentException("rowIndex too low");
    }
    if (rowIndex < maxRows)
    {
      // only clear cache if cache exists, but allow navigation
      textRows[rowIndex] = "";
    }
      
    navigateToRow(rowIndex);
    // clear the existing line
    System.out.print("\u001B[2K");
    System.out.flush();
  }

  /*
   * Uses escape sequence to place cursor on a row,
   * at the beginning of the row
   */
  public void navigateToRow(int rowIndex) {
    if (rowIndex >= maxRows + 1) {
      throw new IllegalArgumentException("rowIndex of " + rowIndex + " >= maxRows + 1 of " + (maxRows + 1));
    }
    if (rowIndex != currentRow) {
      // need to move up or down
      currentRow = rowIndex;
      System.out.print("\u001B[" + (rowIndex + 1) + ";1H");
      //System.out.flush();
    } else {
      // go to beginning of line
      System.out.print("\u001B[1000D");
      //System.out.flush();
    }

  }

  /*
   * escape sequence for clearing the display
   */
  public void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  /*
   * Wrap text in some color
   */
  public static String colorText(String color, String text) {
    return color + text + ANSI_RESET;
  }

}