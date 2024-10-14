import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.io.Reader;
import java.io.Console;
import java.util.ArrayList;

/**
 * DO NOT MODIFY: client code for the APCSA ArrayPlotter lab
 * 
 * @author Orion Smith
 *
 * @version 1.1, 12/03/2020 changed exception handling
 * version 1.0, 11/29/2020 -initial version
 *
 * Demo video of working animations: https://youtu.be/HrvHxUHdAns
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
public class Main {

  // used for menu, and to activate methods in ArrayPlotter
  private static String[] methodNames = { "clear", "rowMajorFill", "colMajorFill", "reverseRowMajorFill",
      "reverseColMajorFill", "mainDiagonalFill", "mainTriangleFill", "otherDiagonalFill", "otherTriangleFill", "xFill",
      "serpentineFill", "borderFill", "checkerboardFill", "cornerFill", "spiralFill" };

  private static final int DEFAULTROWS = 10;
  private static final int DEFAULTCOLS = 10;

  public static void main(String[] args)
      throws java.io.IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // construct the ANSI writer with 26 rows
    ANSI out = new ANSI(26);

    // test out creating the ArrayPlotter
    PlayGrid grid = new PlayGrid(DEFAULTCOLS, DEFAULTROWS, 2, out);
    ArrayPlotter plot = new ArrayPlotter(grid);

    // use the menu helper
    String alg = menuChoice(out);

    boolean programLoop = !alg.startsWith("q");
    long lastTimeCheck = System.currentTimeMillis();
    long moveInterval = 50;

    // this loop won't stop until the user types 'q'
    while (programLoop) {
      // hide menu
      out.clearConsole();

      int numRows = DEFAULTROWS;
      int numCols = DEFAULTCOLS;

      if (alg.contains(" ")) {
        // try to get the other tokens
        String[] algArgs = alg.split(" ");
        try {
          numRows = Integer.parseInt(algArgs[1]);
          numCols = Integer.parseInt(algArgs[2]);
        } catch (Exception e) {
          out.writeRow(21, "bad row/col arguments");
        }

      }
      // re-create grid, ArrayPlotter
      grid = new PlayGrid(numCols, numRows, 2, out);
      plot = new ArrayPlotter(grid);

      // execute algorithm now to build up the future queue of changes
      boolean methodFound = false;
      for (int i = 0; i < methodNames.length; i++) {
        if (alg.startsWith(methodLetter(i))) {
          // it's not magic, it's reflection!
          Method thisMethod = ArrayPlotter.class.getMethod(methodNames[i]);
          thisMethod.invoke(plot);

          out.writeRow(0, ANSI.colorText(ANSI.BACKGROUND_PURPLE + ANSI.TEXT_BRIGHTWHITE,
              padRight("  " + methodNames[i] + ": " + numRows + " rows, " + numCols + " cols", 50)));

          methodFound = true;
        }
      }

      if (!methodFound) {
        out.writeRow(21, "unknown input");
      }

      // initial write
      grid.writeDirtyRows();

      // show controls to user
      out.writeRow(22, ANSI.colorText(ANSI.BACKGROUND_PURPLE + ANSI.TEXT_BRIGHTWHITE,
          padRight("  Controls while animation is running", 50)));
      out.writeRow(23, ANSI.colorText(ANSI.BACKGROUND_PURPLE + ANSI.TEXT_BRIGHTWHITE,
          padRight("  Speed: 1-9, q: quit, enter: pause", 50)));
      out.writeRow(24, ANSI.colorText(ANSI.TEXT_BRIGHTWHITE, "  Speed: " + moveInterval + "ms"));

      // prep for displayLoop
      lastTimeCheck = System.currentTimeMillis();
      boolean displayLoop = true;

      // begin getting individual characters
      out.startCharInput();

      // the display loop keeps re-drawing the grid,
      // updated every moveInterval
      // some input keys can affect or stop output
      // this is how we mimic event-driven programming
      // and achieve responsiveness to individual keys
      while (displayLoop) {

        if (System.currentTimeMillis() - lastTimeCheck > moveInterval) {
          // moveInterval activity
          lastTimeCheck = System.currentTimeMillis();
          // try pushing the next grid update
          if (grid.next()) {
            grid.writeDirtyRows();

          } else {
            displayLoop = false;
          }
        }

        if (System.in.available() != 0) {
          char c = (char) System.in.read();
          if (c >= '1' && c <= '9') {
            // digits 1-9 control speed
            moveInterval = 850 + 100 * (int) ('1' - c);
            out.writeRow(24, ANSI.colorText(ANSI.TEXT_BRIGHTWHITE, "  Speed: " + moveInterval + "ms"));
          } else if (c == (char) (13)) { // pause displayLoop
            out.stopCharInput();
            out.writeRow(25, "Paused: press enter to continue");
            Scanner pauseScan = new Scanner(System.in);
            pauseScan.nextLine();
            pauseScan = null;
            out.writeRow(25, "");
            out.startCharInput();
          } else if (c == 'q') { // quit simulation, return to menu
            displayLoop = false;
          }

        }

      } // displayLoop

      out.stopCharInput();

      // wait for enter
      out.writeRow(25, "Animation finished!  Press enter to return to menu");
      Scanner consoleScan = new Scanner(System.in);
      consoleScan.nextLine();
      consoleScan = null;

      // show menu again
      alg = menuChoice(out);

      programLoop = !alg.startsWith("q");
    } // programLoop

  }

  /**
   * Helper method to create text padded with right spaces
   */
  private static String padRight(String input, int width) {
    return String.format("%-" + width + "s", input);
  }

  /**
   * Helper method to find menu letters
   */
  private static String methodLetter(int index) {
    return "" + (char) ('a' + index);
  }

  /**
   * Helper method to show and get user menu input
   */
  private static String menuChoice(ANSI out) {
    Scanner consoleScan = new Scanner(System.in);
    out.clearConsole();
    out.writeRow(0,
        ANSI.colorText(ANSI.BACKGROUND_BRIGHTYELLOW + ANSI.TEXT_CYAN, padRight("   ArrayPlotter Lab: MENU", 50)));

    // find uncommented methods, and only display those
    Method[] existingMethods = ArrayPlotter.class.getMethods();
    ArrayList<String> existingNames = new ArrayList<String>();
    for (Method m : existingMethods) {
      existingNames.add(m.getName());
    }

    for (int i = 0; i < methodNames.length; i++) {
      if (existingNames.contains(methodNames[i])) {
        out.writeRow(i + 2, ANSI.colorText(ANSI.TEXT_BRIGHTWHITE, methodLetter(i) + ": " + methodNames[i]));
      }

    }

    out.writeRow(18, ANSI.colorText(ANSI.TEXT_BRIGHTYELLOW,
        "Methods by themselves use the default grid of " + DEFAULTROWS + " rows, " + DEFAULTCOLS + " cols."));
    out.writeRow(19, ANSI.colorText(ANSI.TEXT_BRIGHTYELLOW,
        "To create a custom size grid, add two more arguments for rows and cols."));
    int randIndex = (int) (Math.random() * methodNames.length);
    int randRows = (int) (Math.random() * 10) + 4;
    int randCols = (int) (Math.random() * 20) + 4;
    out.writeRow(20,
        ANSI.colorText(ANSI.TEXT_BRIGHTYELLOW, "Example: \"" + methodLetter(randIndex) + " " + randRows + " " + randCols
            + "\" will run " + methodNames[randIndex] + " with " + randRows + " rows, " + randCols + " cols."));
    out.writeRow(22, ANSI.colorText(ANSI.TEXT_BRIGHTYELLOW, "You probably shouldn't use more than 20 rows."));
    out.writeRow(25, ANSI.colorText(ANSI.TEXT_WHITE, "q: quit"));

    String alg = consoleScan.nextLine();

    // instead of closing, mark for garbage collection
    consoleScan = null;
    return alg;
  }

}