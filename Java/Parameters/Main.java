/*
Unit 5 Lesson 2 - Parameters

Lesson Intro: This lesson introduces parameters, which are input for methods. 

Lesson Objectives:
 + Learn the definition of a parameter in Java
 + Create void methods in Java which use parameters
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        tempCheck(101.2); //the value 101.2 is the ACTUAL PARAMETER (argument) 

        //tempCheck("hundred"); - illegal call

        tempCheck(34);

        double t = 55.5;
        tempCheck(t);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        firstlast(word);

        maxvalue(1,10);

        maxValue(1, 2);
        maxValue(13, 2);
        maxValue(4, 4);
    } // end of main() method

    //Example 1

    //the variable temp is the FORMAL PARAMETER - this is a local variable inside of the tempCheck() method
    public static void tempCheck(double temp) {
        if(temp >= 100) {
            System.out.println("Hot");
        }
        else if(temp < 100 & temp > 75) {
            System.out.println("Warm");
        }
        else {
            System.out.println("Cool");
        }
    } // end of tempCheck() method


    //Example 2 - Create a method that contains one formal parameter of datatype String. Print out the first and last letter of the String.
    public static void firstlast(String str) {
        for (int i=0;i<str.length();i++){
            if (i==0 || i==(str.length()-1))
                System.out.print(str.substring(i,i+1));    
        }
        System.out.println();
        //System.out.print(str.substring(0, 1));
        //System.out.print(str.substring(str.length() - 1);
    }

    //Example 3 - Create a method with two parameters (doubles). Print the max value.
    public static void maxvalue(double num1, double num2){
        if (num1>num2)
            System.out.println("Max Vlaue: "+num1);
        else
            System.out.println("Max Vlaue: "+num2);
    }
    
    //Teacher Example 3
    public static void maxValue(double val1, double val2) {
        if(val1 > val2) {
            System.out.println(val1 + " is greater than " + val2);
        }
        else if(val2 > val1) {
            System.out.println(val2 + " is greater than " + val1);
        }
        else {
            System.out.println(val1 + " and " + val2 + " are equal");
        }
    }

} // end of class Main