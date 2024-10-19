/* Friday August 13th, 2021
Unit 1, Lesson 3 - Data Types */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {	
		//Part 1: primitive data types
		
		//boolean true or false
		boolean flag1 = true;
		boolean flag2 = false; 
		System.out.println("flag1 = " + flag1);
		System.out.println("flag2 = " + flag2);
		 
		 //int any whole number positive or negative
		 int x = 3;
		 int y = -5;
		 int z = x + y;
		 System.out.println("x = " + x);
		 System.out.println("y = " + y);
		 System.out.println("z = " + z);
		 
		 //double any number with a decimal positive or negative (doesn't have to contain a decimal)
		 double a = 5;
		 double b = 12.3;
		 double c = -31.4; 
		 System.out.println("a = " + a + ", b = " + b + ", c = " + c);


		//Part 2: Reference data types   
		String name = "John";
		System.out.println("Name is: " + name);
egers
		//Part 3: Data types smallest to largest
		/* boolean --> int --> double --> String */

		//Part 4: Definition of primitive vs. reference 
		//primitive datatype - stored directly in the variable (boolean, int, double)
		//reference datatype - stores a memory reference where the data is stored (String)

		//Part 5: Input & Output of data types
		Scanner scan = new Scanner(System.in);

		//boolean input/output
		System.out.print("Q1: Is the sky blue? (true or false) ");
		boolean ask = scan.nextBoolean();
		System.out.println("Answer 1: " + ask);

		//integer input/output
		System.out.print("Q2: How old are you? ");
		int age = scan.nextInt();
		System.out.println("Answer 2: " + age);

		//double input/output
		System.out.print("Q3: What is the average score? ");
		double score = scan.nextDouble();
		System.out.println("Answer 3: " + score);
  }
} 