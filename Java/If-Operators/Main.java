/* Unit 3 Lesson 2 - Ifs Making Decisions

Lesson Intro: This lesson introduces additional value (comparison or relational) operators in if statements.

Lesson Objectives:
 + Understand the meaning of the operators ==, <, >, <=, >= and !=
 + Use these to create boolean statements comparing primitive values
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Review from U3L1 - checking for equality
        boolean flagCaptured = true;
        if(flagCaptured == true) {
            System.out.println("Game over.");
        }
        
        //Part 1: Comparison Operators - simplify to true or false
        // == Equal
        // < Less than
        // > Greater than
        // <= Less than or equal to
        // >= Greater than or equal to
        // != Not equal to        
        
        //Example: Check to see if you are passing a class.
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        double grade = scan.nextDouble();
        if(grade > 59.99) {
            System.out.println("Passing");
        }
        
        //Prompt: Input a temperature as a double. Test if the temperature is greater than or equal to 98.6 degrees. If it is, print a message that says, "you have a fever."

        System.out.print("Please enter your current temperature: ");
        double temp = scan.nextDouble();
        if(temp >= 98.6) {
            System.out.println("you have a fever.");
        }

        //Part 2: Order of Operations with Relational Operators
        int x = 8;
        int y = 2;
        if(x + 12 / y + 4 >= 15) {
            System.out.println("Greater than or equal to 15");
        }

        //Simplify all arithmetic operations on the left and right hand side of the relational operators, then simplify the expression to true or false.
   
    }
}
