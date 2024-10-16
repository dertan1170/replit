/*

Monday March 28 - Sorting Activity

Directions: For this activity, you need to complete the sorting algorithm below. Steps are given to follow, and your goal it to implement the steps into Java program code.

Please note, the code in the main() method should not be changed.

Please note, for this example, you will be working with tranditional arrays. We will be moving on to ArrayList later in the lesson.

Here are a couple sample runs:

Sample #1:
Enter the size of the list: 10
Unsorted List: 52 79 48 44 41 53 68 10 71 56 
Sorted List: 10 41 44 48 52 53 56 68 71 79 


Sample #2:
Enter the size of the list: 4
Unsorted List: 97 36 37 55 
Sorted List: 36 37 55 97 

Sample #3:
Enter the size of the list: 2
Unsorted List: 26 14 
Sorted List: 14 26 

*/

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the list: ");
		int size = scan.nextInt();
		
    int[] list = new int[size];

	  int max = 100;
		int min = 0;
		int range = max - min + 1;
		
		//generate random numbers within the range
		for (int i = 0; i < size; i++) {
			int rand = (int)(Math.random() * range) + min;
			list[i] = rand;
		}

		//print the unsorted list
		System.out.print("\nUnsorted List: ");
		for (int val : list) {
      System.out.print(val + " ");
    }

		//print the sorted list using the algorithm below
		System.out.print("\nSorted List: ");
		sortAndPrint(list);
  }

	public static void sortAndPrint(int[] elements) {
		/* Sorting Algorithm #1
			1. Find the smallest value in the array.
			2. Swap it with the current position (starting at first element).
			3. Move the current position over one.
			4. Continue these steps until you reach the end of the array.
		*/
    for (int i=0;i<elements.length;i++){
      for (int j=i+1;j<elements.length;j++){
        int temp=0;
        if(elements[i]>elements[j]){
          temp=elements[i];
          elements[i]=elements[j];
          elements[j]=temp;
        }
      }
    }
		/*
    for (int i = 0; i < elements.length - 1; i++)	{
		  int minIndex = i;
		  for (int j = i + 1; j < elements.length; j++) {
				//find the smallest value
		    if (elements[j] < elements[minIndex]) {
					//store the location (j) of the smallest value
		      minIndex = j;
		    }
		  }

			//swap the current position with the smallest value position
		  int temp = elements[i];
		  elements[i] = elements[minIndex];
		  elements[minIndex] = temp;
		 }
    */


		//code used to print the array, do not change
		for (int val : elements)
    {
      System.out.print(val + " ");
    }
	}
}