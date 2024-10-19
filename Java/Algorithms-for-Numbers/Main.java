/* Unit 4 Lesson 2 - Algorithms for Numbers */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		////////////////////////////////////
		//PART 1 - ALGORITHMS without LOOPS
		////////////////////////////////////

		//Example #1 - Determine whether two integers are divisible.
		System.out.println("Enter two integers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (b % a == 0) 
		{
			System.out.println(a + " divides " + b);
		}
		else {
			System.out.println(a + " does not divide " + b);
		}

		////////////////////////////////////
		//PART 2 - ALGORITHMS with LOOPS
		////////////////////////////////////

		//Example #2 - Check whether the inputed value is less than 10. Enter -1 to stop.
		int count = 0;
		int num = 0;
		while (num != -1) 
		{
			System.out.print("Enter a positive int, or -1 to stop: ");
			num = scan.nextInt();
			if (num < 10) 
			{
				count++;
			}
		}
		count--; // Subtract 1 as we don't want to count the input of "-1"
		System.out.println("There are " + count + " numbers are less than 10");

		//Example #3 - Printing the individual digits of a number
		System.out.print("Enter a integer: ");
		int val = scan.nextInt();
		while (val > 0)
		{
			int digit = val % 10;
			System.out.println(digit);
			val /= 10;
		}

		//Example #4 - find the maximum value in a series of numbers.
		int max = Integer.MIN_VALUE;
		int number = 0; 

		while (number != -1) 
		{
			System.out.println("Enter a positive int, or -1 to stop");
			number = scan.nextInt();
			if (number > max) 
			{
				max = number;
			}
		}
		System.out.println("The max entered is: " + max);

  }
}