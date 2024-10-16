class Main {
  public static void main(String[] args) {
    /*Part 1 - Array Syntax*/
		//Format 1
		double[] list1 = {1.0, 2.1, 3.3};
		//Format 2
		double list2[] = {1.1, 2.2, 3.4};
		//The square bracket can be attached to the datatype or the name of the array

		/*Part 2 - Printing an Array */
		printDoubleArray(list1); //method is defined below

		/*Part 3 - Assigning the values of an array with a for-loop */
		int[] list3 = new int[10];
		for(int i = 0; i < list3.length; i++) {
			//assign 0's
			list3[i] = 0;
			//list3[i] = 1; //assign 1's
			//list3[i] = i; //assign i
			//list3[i] = i + 1; //assign i+1
		}
		//print your results
		printIntArray(list3);

		/*Part 4 - Count the # of elements in an array */
		int[] list4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int count = countEvenValues(list4);
		System.out.println("There are " + count + " even values inside of list4.");

		/*Part 5 - Searching for an element and printing the index where it was found*/
		int search = 6;
		int where = -1;
		for (int i = 0; i < list4.length; i++) {
		  if (list4[i] == search) {
		    where = i;
		    break;
		  }
		}
		System.out.println("The element 6 was found at index: " + where);
  }

	//method for part 2
	public static void printDoubleArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//method for part 3
	public static void printIntArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//method for part 4
	public static int countEvenValues(int[] arr) {
		int countEvens = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				countEvens++;
			}
		}
		return countEvens;
	}
}