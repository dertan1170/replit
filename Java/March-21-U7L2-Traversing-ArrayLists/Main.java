/*

U7L2 - Traversing ArrayLists

Lesson Intro:
This lesson describes how to traverse ArrayLists using both for-loops and for-each loops.

Lesson Objectives:
+ Understand the advantages and limitations of using a for-each loop versus a standard for loop to traverse an ArrayList

+ Understand how to safely modify the length of an ArrayList while traversing it.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

		//Setup - Create an ArrayList of Booleans
		ArrayList<Boolean> flags = new ArrayList<Boolean>();
		flags.add(true);
		flags.add(false);
		flags.add(true);
		flags.add(false);
		flags.add(true);
		System.out.println(flags);

		int countTrue = 0;
		int countFalse = 0;

		//Part 1 - Traversing an ArrayList with a traditional for-loop. Find the # of true values.
		for(int i = 0; i < flags.size(); i++) {
			if(flags.get(i) == true){
				countTrue++;
			}
		}
		System.out.println("The number of true values in the ArrayList is: " + countTrue);

		//Part 2 - Traversing an ArrayList with an enhanced for-loop. Find the # of false values.
		for(Boolean x : flags) {
			if(x == false){
				countFalse++;
			}
		}
		System.out.println("The number of false values in the ArrayList is: " + countFalse);

		//Part 3 - Removing items from a list

				//+++ Removing items with an enhanced for-loop:
				//An enhanced for-loop allows you to traverse a list from beginning to the end.
				//You cannot use an enhanced for loop to modify the list
				//This also means you cannot utilize the .remove() method to remove items from the list
		
				//+++ Removing items with a traditional for-loop:
				//It's important to be careful when removing items inside of the loop. The .remove() method causes the ArrayList the reduce in size, and the elements of the array with shift.
				//If you remove an item, the list with shift, and you may skip some of the elements of the ArrayList.
  
		//It's best practice to traverse the list in reverse when removing items. This will ensure that no items are skipped.
		ArrayList<String> breeds = new ArrayList<String>();
		breeds.add("Boxer");
		breeds.add("Bulldog");
		breeds.add("Poodle");

		for (int i = breeds.size() - 1; i >= 0; i--) {
		  breeds.remove(i);
		} 
		
		//Part 4 - Traversing Multiple ArrayLists
		breeds.add("Beagle");
		breeds.add("Dalmatian");
		breeds.add("Hound");

		ArrayList<String> breeds2 = new ArrayList<String>();
		breeds2.add("Beagle");
		breeds2.add("Bulldog");
		breeds2.add("Schnauzer");

		//The two lists should be the same size
		for (int i = 0; i < breeds2.size(); i++) {
			if (!breeds2.get(i).equals(breeds.get(i))) {
				System.out.println("\nWe found a spot where these lists have DIFFERENT breeds:");
				System.out.println("Breeds 1 contains: " + breeds.get(i));
				System.out.println("Breeds 2 contains: " + breeds2.get(i));
			}
			else {
				System.out.println("\nWe found a spot where these lists have THE SAME breeds:");
				System.out.println("Breeds 1 contains: " + breeds.get(i));
				System.out.println("Breeds 2 contains: " + breeds2.get(i));
			}
		}
	}
}