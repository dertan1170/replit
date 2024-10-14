/**
 * DO NOT MODIFY: an item that lives in a PlaySpace
 * 
 * @author Orion Smith
 *
 * @version 1.1, 11/29/2020
 *   -modifications specific to ArrayPlotter lab
 *  version 1.0, 11/28/1919
 *   -initial version created for Console Dodgem
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
public class PlayItem
{
  private int x;
  private int y;
  private String showString;
  private String showColor;
  private PlayGrid grid;

  public PlayItem(String inShowColor, String inShowString, PlayGrid inGrid)
  {
    x = -1;
    y = -1;
    showColor = inShowColor;
    showString = inShowString;
    grid = inGrid;
  }

  public PlayItem(int inX, int inY, String inShowColor, String inShowString, PlayGrid inGrid)
  {
    x = inX;
    y = inY;
    showColor = inShowColor;
    showString = inShowString;
    grid = inGrid;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setX(int newX)
  {
    x = newX;
  }

  public void setY(int newY)
  {
    y = newY;
  }

  public String toString()
  {
    return showColor + showString;
  }
}