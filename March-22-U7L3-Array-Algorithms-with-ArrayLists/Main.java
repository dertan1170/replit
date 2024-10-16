/*
U7L3 - Array Algorithms with ArrayLists

Lesson Intro: This lesson shows how array algorithms can be adapted for use with ArrayLists.

Lesson Objective: 
Recognize and implement the standard array algorithms using an ArrayList
*/

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Purple");
		colors.add("Black");

		//Example 1: Print out any colors that start with the letter B
		for(String color : colors) {
		  if (color.substring(0, 1).equals("B")) {
		    System.out.println(color + " starts with a B.");
		  }
		}
		
		//Example 2: Reverse the order of the Strings in the list

		//The example below demonstrates an algorithm for reversing the elements of a list, by removing them one at a time and moving them to the front of the ArrayList.
		System.out.println("\nBefore the reverse: " + colors);

		for (int i = 0; i < colors.size(); i++) {
		  colors.add(0, colors.remove(i));
		}

		System.out.println("After the reverse: " + colors);

		/* each iteration of the loop above
			i: 	colors:
			0 	[Red, Orange, Yellow, Green, Blue, Purple, Black]
			1 	[Orange, Red, Yellow, Green, Blue, Purple, Black]
			2 	[Yellow, Orange, Red, Green, Blue, Purple, Black]
			3 	[Green, Yellow, Orange, Red, Blue, Purple, Black]
			4 	[Blue, Green, Yellow, Orange, Red, Purple, Black]
			5 	[Purple, Blue, Green, Yellow, Orange, Red, Black]
			6 	[Black, Purple, Blue, Green, Yellow, Orange, Red]
		*/
  }
}