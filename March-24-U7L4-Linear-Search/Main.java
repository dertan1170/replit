/*

U7L4 - Linear Search

Lesson Intro: This lesson covers the linear search algorithm, which was actually coded earlier in the course; today we’ll review it, and then compare it with other searching and sorting algorithms.

Lesson Objectives:
 + Review the steps in the Linear Search algorithm
 + Understand the advantages and disadvantages of using the linear search algorithm to find data in an array or ArrayList
*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the size of the ArrayList: ");
		int size = scan.nextInt();

		System.out.print("Enter the item you would like to find: ");
    int target = scan.nextInt();
		
    ArrayList<Integer> list  = new ArrayList<Integer> ();

	  int max = 100;
		int min = 0;
		int range = max - min + 1;
		
		// generate random numbers within the range
		for (int i = 0; i < size; i++) {
			int rand = (int)(Math.random() * range) + min;
			list.add(rand);
		}
		
		//Print the list of random numbers
		System.out.println(list);

		//LINEAR SEARCH
		//The following code demonstrates a linear search. The search will start with i = 0 index and iterate until i = list.size() - 1. If the item is found, the search with stop (break).
    int position = -1;
    for (int i = 0; i < list.size(); i++) {
		  if (list.get(i).equals(target)) {
		    position = i;
				break;
		  }
		}
		
    if(position > -1) {
      System.out.println("The item was found at position: " + position);
    }
    else {
      System.out.println("The item was not found in the list.");
    }  
	} // end of main()
} // end of class