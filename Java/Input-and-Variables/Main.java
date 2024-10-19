/* Class Notes - August 20th
Period 1
Project STEM - Unit 1 Lesson 2 - User Input and Variables */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
		/* Starter Code */
		Scanner scan = new Scanner(System.in); 
    String n;
    System.out.println("What is your name?");
    n = scan.nextLine();
    System.out.println("Hello " + n + ". Nice to meet you"); 
    System.out.println("What's your favorite food?");
    String FavFood = scan.nextLine();
    System.out.println(FavFood + " sounds delicious.");
  }
}