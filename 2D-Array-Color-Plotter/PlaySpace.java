import java.util.ArrayList;

/**
 * DO NOT MODIFY: a single space in a PlayGrid
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
public class PlaySpace {
  private int x;
  private int y;
  private String spaceColor;
  private String spaceText;
  private ArrayList<PlayItem> items;

  public PlaySpace(int inX, int inY, String inSpaceColor, String inSpaceText) {
    x = inX;
    y = inY;
    spaceColor = inSpaceColor;
    spaceText = inSpaceText;
    items = new ArrayList<PlayItem>();
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getSpaceColor() {
    return spaceColor;
  }

  public void setSpaceColor(String newSpaceColor) {
    spaceColor = newSpaceColor;
  }

  public String getspaceText() {
    return spaceText;
  }

  public void setSpaceText(String newSpaceText) {
    spaceText = newSpaceText;
  }

  public ArrayList<PlayItem> getItems() {
    return items;
  }

  public void addItem(PlayItem item) {
    items.add(item);
  }

  public String toString() {
    int numItems = items.size();
    if (numItems > 0) {
      // show the last item in the list
      return ANSI.colorText(spaceColor, items.get(numItems - 1).toString());
    } else {
      // show the color and default character for this space
      return ANSI.colorText(spaceColor, spaceText);
    }
  }

}