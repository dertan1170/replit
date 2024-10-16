/*
Unit 7 Lesson 1 - ArrayList

Lesson Intro: This lesson explains what an ArrayList is, and the advantages to using an ArrayList. 

Lesson Objectives: 
 + Understand that an ArrayList is used to hold multiple data as with an array, but that it can only hold class type data and not primitives
 + Write code which declares and adds data to an ArrayList
 + Learn some of the methods which can be called by objects of the ArrayList class

*/

//Part 1: import ArrayList library in order to use the ArrayList methods
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Part 2: Declaring ArrayLists
		System.out.println("Part 2 Code:");

		//Option 1 - Specify the size
		ArrayList<Integer> list1 = new ArrayList<Integer>(3); //construct an ArrayList 
		list1.add(1);
		list1.add(3);
		list1.add(5);
		System.out.println(list1);

		//Option 2 - Unknown size
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the ArrayList: ");
		int size = scan.nextInt();
		while(size < 0) {
			System.out.print("Enter a valid size: ");
			size = scan.nextInt();
		}

		ArrayList<Double> list2 = new ArrayList<Double>(size); //construct an ArrayList 
		for(int i = 0; i < size; i++) {
			System.out.print("Add a double to the list: ");
			double item = scan.nextDouble();
			list2.add(item);
		}
		System.out.println(list2);
		
	  //Part 3 - Details of an ArrayList

		/*
		An ArrayList is a collection or list that only stores class data types, or objects. It references to the data it contains.
		
		The size of an ArrayList is not fixed, which means an ArrayList is what we call a mutable object -- it can be changed unlike an array. When we insert a new item, the list grows and shifts.
		
		An ArrayList is a class, it comes with some built-in methods that are extremely useful. Operations like inserting, deleting, and sorting elements, among others, are already worked out for us in ArrayList class methods and come ready to use.
		
		*/

		//Part 4 - Built-in Methods
		/*

		Note, an ArrayList has index values just like an array. The first element is at 0, and the list element is at size() - 1.

		list.add(e); --> Adds e to end of list

		list.add(i, e); --> Adds element e at location i
		
		list.set(i, e); --> Resets element at i with object e
		
		list.get(i); --> Returns the element at i
		
		list.remove(i); --> Removes element at i
		
		list.size(); --> Returns number of elements in list
		*/

		System.out.println("\n\nPart 5 Code:");
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("tiger"); //adds to the end
		animals.add("monkey"); //adds to the end
		animals.add("elephant"); //adds to the end
		System.out.println(animals); 

		animals.add(1, "snake"); //adds at index 1
		System.out.println(animals);

		animals.set(0, "lion"); //resets tiger to lion at index 0
		System.out.println(animals);

		//print out each element with a for loop
		for(int i = 0; i < animals.size(); i++) {
			System.out.println("Animal #" + (i + 1) + ": " + animals.get(i));
		}

		animals.remove(animals.size() - 2); //remove the second to the last element (monkey)
		System.out.println(animals);


		System.out.println("\n\nPrompt Code:");

		//Prompt:
		//Create an ArrayList of Strings called food
		//Add at least 5 food items to the list
		//Print out the food items located on the odd index (1, 3, 5, 7, ...)
		//Insert a new food item anywhere but the end of the list
		//Print the list without a for-loop
    ArrayList<String> food = new ArrayList<String>();
    food.add("apple");
    food.add("bread");
    food.add("pizza");
    food.add("cereal");
    food.add("corndog");
    for(int i=0;i<food.size();i++){
      if(i%2==1)
        System.out.print(food.get(i)+" ");
    }
    System.out.println();
    food.add(1, "donut");
    System.out.println(food);


    
  }
}