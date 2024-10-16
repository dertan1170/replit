class Main {
  public static void main(String[] args) {
		int size = 8;
		
    int[] listA = new int[size];
		int[] listB = new int[size];

	  int max = 100;
		int min = 0;
		int range = max - min + 1;
		
		//generate random list within the range
		for (int i = 0; i < size; i++) {
			int rand = (int)(Math.random() * range) + min;
			listA[i] = rand;
			listB[i] = rand;
		}

		System.out.println("\n============= Unsorted List ============= ");
		printArray(listA); //print listA or listB (same list)

		System.out.println("\n============= Sorted Lists ============= ");

		System.out.println("\n============= Selection Sort List =============");
		selectionSortAndPrint(listA);
		
		System.out.println("\n============= Insertion Sort List ============= ");
		insertionSortAndPrint(listB);
  }

	public static void printArray(int[] arr) {
		for (int val : arr) {
      System.out.print(val + " ");
    }
		System.out.println();
	}

	//execution count located at the inner most loop because this is the portion of code that gets run the most. It gives us the best estimate of where we are using the most resource (computing power).
	public static void selectionSortAndPrint(int[] elements) {
		int executionCount = 0;
	  for (int j = 0; j < elements.length - 1; j++) {
	    int minIndex = j;
	    for (int k = j + 1; k < elements.length; k++) {
	      if (elements[k] < elements[minIndex]) {
	        minIndex = k;
	      }
				executionCount++;
	    }
	    int temp = elements[j];
	    elements[j] = elements[minIndex];
	    elements[minIndex] = temp;
			printArray(elements); 
	  }

		System.out.println("\nExecution count: " + executionCount);
		printArray(elements); //print the sorted array
	}
	
	public static void insertionSortAndPrint(int[] elements) {
		int executionCount = 0;
	  for (int j = 1; j < elements.length; j++) {
	    int temp = elements[j];
	    int possibleIndex = j;
	    while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
	      elements[possibleIndex] = elements[possibleIndex - 1];
	      possibleIndex--;
				executionCount++;
	    }
	    elements[possibleIndex] = temp;
			printArray(elements);
	  }

		System.out.println("\nExecution count: " + executionCount);
		printArray(elements); //print the sorted array
	}
}