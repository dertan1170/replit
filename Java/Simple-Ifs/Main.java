/* Unit 3: Lesson 1 - Simple Ifs

Lesson Overview: This lesson introduces simple if statements, which function as gates within programs.

Lesson Objective:
+ Understand that programs can have commands which only run if certain conditions are true (e.g. based on the value of a variable)
+ Write code using if statements in Java
+ Control the sequence of a program using If statements
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        Scanner scan = new Scanner(System.in);
        
        int numberWheels = 0;
        System.out.println("How many wheels does the vehicle have?");
        numberWheels = scan.nextInt();
        //if statement checks for equality with double equals sign (==)
        //No curly braces are needed if there's just one line of code after the condition
        if(numberWheels == 2)
            System.out.println("you own a scooter");
        //Curly braces are needed because there's more than one line of code after the codition
        if(numberWheels == 4) {
            System.out.println("you own a truck, suv, or sedan");
            System.out.println("congrats.");
        }
        

        //Prompt: Input a double and test if it is equal to 17.25
        System.out.println("Please input a double:");
        double d1 = scan.nextDouble();
        if (d1==17.25){
        System.out.println("17.25 is a nice number");
        }
        //Program flow: 
        // + every time an "if" is introduced, the compile will check the condition 
        // + program code may get skipped over, so our programs are not sequencial anymore        
        
    }
}
