/**
 *
 * @author - Robert Glen Martin
 * @author - Orion Smith
 *
 * The ArrayPlotter class provides methods for drawing in a grid by
 * setting the boolean values of a 2D array.
 *
 * @version 2.0 11/29/2020
 *   - ANSI and console-enabled by Orion Smith
 * version 1.0 10/18/2014
 *   - written by Robert Glen Martin
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
public class ArrayPlotter {
  
  /**
   * DO NOT MODIFY: The PlayGrid is the link to the "graphical" user interface
   * for this lab.
   */
  private PlayGrid gui;

  /**
   * DO NOT MODIFY: The Color Array.  Color based on element values.
   * -true: Color the cell with the drawing color 
   * -false: Color the cell with the background color
   */
  private boolean[][] colorArray;

  /**
   * TODO: Initialize the internal Color Array to a new 2D array of boolean values
   * with the dimensions given by grid.getWidth() and grid.getHeight(). Also alias
   * the internal PlayGrid variable to the parameter value
   */
  public ArrayPlotter(PlayGrid grid) {
    gui = grid;
    colorArray = new boolean [grid.getHeight()][grid.getWidth()];
  }

  // Drawing Methods

  /** TODO: Removes all objects from the grid. */
   public void clear() {  
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         colorArray[r][c] = false; //turn each square yellow
         gui.update(colorArray); //update the screen
       }
     }
   } 

  /** TODO: Fill in all the cells of the grid using a row-major traversal. */
   public void rowMajorFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         colorArray[r][c] = true; //turn each square blue
         gui.update(colorArray); //update the screen
       }
     }
   }

  /** TODO: Fill in all the cells of the grid using a column-major traversal. */
   public void colMajorFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         colorArray[c][r] = true; //turn each square blue
         gui.update(colorArray); //update the screen
       }
     }
   }

  /**
   * TODO: Fill in all the cells of the grid bottom-up, going left-to-right across
   * each row.
   */
   public void reverseRowMajorFill() {
     for(int r=colorArray.length-1;r>=0;r--){
       for(int c=0;c<colorArray[0].length;c++){
         colorArray[r][c] = true; //turn each square blue
         gui.update(colorArray); //update the screen
       }
     }
   }

  /**
   * TODO: Fill in all the cells of the grid right-to-left, going up each column
   * from the bottom.
   */
   public void reverseColMajorFill() {
     for(int r=colorArray.length-1;r>=0;r--){
       for(int c=colorArray[0].length-1;c>=0;c--){
         colorArray[c][r] = true; //turn each square blue
         gui.update(colorArray); //update the screen
       }
     }
   }

  /**
   * TODO: Fill in the cells of the grid along the diagonal from the upper-left
   * corner towards the lower-right corner.
   */
   public void mainDiagonalFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         if (r==c){
           colorArray[r][c] = true; //turn each square blue
           gui.update(colorArray); //update the screen
           }
       }
     }
   }

  /** TODO: Fill in the cells of the grid on and below the main diagonal. */
   public void mainTriangleFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         colorArray[r][c] = true;
         if (r==c){
           colorArray[r][c] = true;
           c=colorArray[0].length;
           }
         gui.update(colorArray); //update the screen
       }
     }
   }

  /** TODO: Fill in the cells of the grid on the other diagonal. */
   public void otherDiagonalFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=colorArray[0].length-1;c>=0;c--){
         if (r+c==colorArray[0].length-1){
           colorArray[r][c] = true; //turn each square blue
           gui.update(colorArray); //update the screen
           }
       }
     }
   }

  /** TODO: Fill in the cells of the grid on and below the other diagonal. */
   public void otherTriangleFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=colorArray[0].length-1;c>=0;c--){
         colorArray[r][c] = true;
         if (r+c==colorArray[0].length-1){
           colorArray[r][c] = true;
           c=-1;
           }
         gui.update(colorArray); //update the screen
       }
     }
   }

  /**
   * TODO: Fill in the cells of the grid on the two diagonals
   **/
   public void xFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         if (r==c){
           colorArray[r][c] = true; //turn each square blue
           gui.update(colorArray); //update the screen
           }
       }
     }
     for(int r=0;r<colorArray.length;r++){
       for(int c=colorArray[0].length-1;c>=0;c--){
         if (r+c==colorArray[0].length-1){
           colorArray[r][c] = true; //turn each square blue
           gui.update(colorArray); //update the screen
           }
       }
     }
   }

  /** TODO: Fill in the cells of the grid in a serpentine fashion. */
   public void serpentineFill() {
     for(int r=0;r<colorArray.length;r++){
       if (r%2==0){
         for(int c=0;c<colorArray[0].length;c++){
           colorArray[r][c] = true;
           gui.update(colorArray);
         }
       }
       else{
         for(int c=colorArray[0].length-1;c>=0;c--){
           colorArray[r][c] = true;
           gui.update(colorArray);
         }
       }
     }
   }

  /**
   * TODO: Fill in the cells of the grid along the outside border, starting in the
   * upper left corner and going clockwise.
   **/
   public void borderFill() {
    for(int c=0;c<colorArray[0].length;c++){
      int r=0;
      colorArray[r][c] = true;
      gui.update(colorArray);
    }
    for(int c=1;c<colorArray[0].length;c++){
      int r=colorArray.length-1;
      colorArray[c][r] = true;
      gui.update(colorArray);
    }
    for(int c=colorArray[0].length-2;c>=0;c--){
      int r=colorArray.length-1;
      colorArray[r][c] = true;
      gui.update(colorArray);
    }
    for(int c=colorArray[0].length-2;c>0;c--){
      int r=0;
      colorArray[c][r] = true;
      gui.update(colorArray);
    }
  }

  /**
   * EXTRA CREDIT: fill the array in a checkerboard pattern in row-major order,
   * such that on even-indexed rows (rows with even index numbers) the
   * even-indexed columns only get filled, and on odd-indexed rows the odd-indexed
   * columns only get filled.
   */
   public void checkerboardFill() {
     for(int r=0;r<colorArray.length;r++){
       for(int c=0;c<colorArray[0].length;c++){
         if (r%2==0){
           if (c%2==0){
             colorArray[r][c] = true;
             gui.update(colorArray);
            }
           }
         else{
           if (!(c%2==0)){
             colorArray[r][c] = true;
             gui.update(colorArray);
            }
         }
        }
       }
   }

  /**
   * EXTRA CREDIT: fill the topmost row from right to left, then the unfilled
   * cells in the leftmost column from top to bottom, then go one column to the
   * right and fill the unfilled cells from bottom to top, then fill the unfilled
   * cells in the second row from left to right, then go to the third row (index
   * 2) and fill the unfilled cells from right to left which begins the sequence
   * again until all cells are filled. Must fill all cells with no duplication
   * , and cannot check the
   * current value of any cell in the array before filling it.
   */
  // public void cornerFill() {
  // }

  /**
   * EXTRA CREDIT: Spiral IN from the outside to the middle.
   * 
   * Start at the top left cell, then go right, then down, then left, then up. Do
   * not fill any cells twice. Stop when you can no longer fill any cells.
   * 
   * RESTRICTION: Don't use any if statements to check the existing state of
   * cells: your algorithm must understand where it needs to fill without having
   * to test.
   */
  // public void spiralFill() {
  // }

  // Private Drawing Methods
  /** TODO: Fill in a grid row from left to right. */
  // private void fillRowLeftToRight(boolean[] row) {
  // }

  /** TODO: Fill in a grid row from left to right. */
  // private void fillRowRightToLeft(boolean[] row) {
  // }

}
