/*
Unit 3: Lesson 5 - Short Circuit Evaluation

Lesson Intro: This lesson introduces short-circuit evaluation, which is a shortcut for evaluating boolean statements.

Lesson Objectives:
 + Use short-circuit evaluation to save time when evaluating boolean statements
 + Understand that Java uses short-circuit evaluation when evaluating boolean statements and how to take advantage of this

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        // EXAMPLE 1

        System.out.print("Enter a grade: ");
        int y = scan.nextInt();

        if ( y < 0 || y > 100) {
            System.out.println( "Not a valid grade.");
        }
        //When you see a compound boolean statements with an || operator, if the condition on the left is TRUE, the compiler will NOT evaluate the whole thing because it should evaluate to TRUE no matter was the condition is on the right.

        // EXAMPLE 2 - && COMPOUND CONDITIONAL

        int x = 9;
        if ( x > 10 && (7 * 3 / 2 + 1 <= 3 / 1 * 34)) {
            System.out.println( "True statement");
        }
        else {
            System.out.println("False statement");
        }

        //When you see a compound boolean statements with an && operator, if the condition on the left is FALSE, the compiler will NOT evaluate the whole thing because it should evaluate to FALSE no matter was the condition is on the right.


        // Why is this useful??

        // This is helpful when we need to divide by zero.

        // In Java, we cannot perform the following operations:

        //System.out.println(10 / 0);
        //System.out.println(10 % 0);

        //These two print statements will get an Arithmetic Exception error.

        //We can write a compound conditional that will check for zero before we divide

        // EXAMPLE 3

        System.out.println("Enter two values: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a != 0 && b / a == 2)
        {
            System.out.println("a is half of b");
        }

        // In this example, if a == 0, then the compound conditional will be FALSE, and the second condition will not be checked. This would prevent an Arithmetic Exception in your code.


    }

}
