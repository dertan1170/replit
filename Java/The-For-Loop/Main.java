/* Unit 4 Lesson 3 - The For Loop

Lesson Intro:

Today, you'll learn about the for loop, which is another kind of loop that focuses on counting.


Lesson Objectives:
 + Learn the syntax of a for loop in Java
 + Write code which uses for loops to repeat commands

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //For Loop - Will repeat as long as a condition is true.
        //For Loops give us access to an index variable.
        //The index variables will be used in a for loop when you need to count.
        
        System.out.println("\nPrint the numbers 0 to 9");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        

        // 3 parts of a for loop
        // 1. initialization - first part run before we enter the loop
        // 2. condition - this condition must be true in order to run the code inside of the loop - the loop will stop when this condition is false
        // 3. increment/step - tells the for loop how to change the index variable

        //Prompt: Write a loop to print the even numbers 20 to 100

        //Solution 1:
        for (int i=20; i!=102 ; i+=2){
            System.out.print(i+" ");
        }

        //Solution 2:
        for(int i = 20; i <= 100; i++) {
            if(i % 10 == 0) 
                System.out.println();
            if(i % 2 == 0) 
                System.out.print(i + " ");
        }

        System.out.print("\nEnter a String: ");
        String str = scan.nextLine();
        int i = 0;
        while (i < str.length()) {
            System.out.println(str.substring(i, i + 1));
            i++;
        }

        //Covert the code above to a for-loop
        System.out.print("\nEnter a String: ");
        String str = scan.nextLine();
        for (int i=0;i < str.length();i++){
            System.out.println(str.substring(i, i + 1));
        }
    }
}
