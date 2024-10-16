/*
Unit 5 Lesson 8 - Static vs. Instance

Lesson Intro: This lesson covers the static modifier, which, when added to a variable or method, means that only one copy exists for all objects of that class.

Lesson Objectives:
 + Understand the difference between static and instance variables and methods
 + Learn some uses of static variables and methods

*/

public class Main {
  public static void main(String[] args) {

		Book b1 = new Book ("Ender's Game", "Orson Scott Card", 1985);
		Book b2 = new Book("Lord of the Flies", "William Golding", 1954);
		Book b3 = new Book("The Grapes of Wrath", "John Steinbeck", 1939);

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);


		/* Part 4: STATIC METHODS */
		//static means you do not need to create an object to use the method
		//for example, the Math class methods are static

		System.out.println("Static Methods in the Math class");
		System.out.println(Math.sqrt(32));

		//Notice how I don't need an object to call the sqrt() function
		
  }
}