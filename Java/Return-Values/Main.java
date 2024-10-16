/* Unit 5 Lesson 4 - Return Values

Lesson Intro: 
In this lesson, you will learn about return statements, which send a value back to the calling method, and thus provide output, which can be stored as a variable.

Lesson Objective:
 + Understand that methods can return values when called
 + Write methods which return values and write code which catches values returned from methods which are called

 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        welcomeMessage();

        int rand = randomValue(0, 10);
        System.out.println(rand);

        //create code to test the method below
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nunber: ");
        double val = scan.nextDouble();
        //String evenOdd = evenOdd(val);
        //print evenOdd
        System.out.println(evenOdd(val));

        //Code to check pythagorean theorem
        System.out.print("\nEnter side a: ");
        double a = scan.nextDouble();

        System.out.print("Enter side b: ");
        double b = scan.nextDouble();

        System.out.println("The hypotenuse is equal to: " + hypotenuse(a, b));
    }

    public static void welcomeMessage() {
        System.out.println("Hello, good morning!");
    }

    //non-void methods
    //datatype - int, double, boolean, String

    public static int randomValue(int min, int max) {

        int range = max - min + 1;
        int x = (int)(Math.random() * range) + min;


        return x;
    }


    //Prompt #1 - Write a non-void method that returns a String. Return whether the parameter (double) is even or odd.
    public static String evenOdd(double num){
        //Option #1
        /*
        String result = "odd";
        if(num % 2 == 0) {
            result = "even";
        }
        return result;
        */
        //Option #2
        if (num % 2 == 0)
            return "even";
        else
            return "odd";
    }

    //Prompt #2 - Create a non-void method that returns a double. Given side lengths a (double) and b (double) of a right triangle, calculate and return side c.
    public static double hypotenuse(double a,double b){
        double c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        //double c = Math.sqrt(a * a + b * b);
        return c;
    }
}