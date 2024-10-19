/* Unit 4 - Lesson 1 - While Loops

Lesson Intro: This lesson introduces loops, which are used to repeat commands. While loops allow us to repeat blocks of code as long as a condition is true.

Lesson Objectives:
 + Write code using while loops to repeat blocks of commands
 + Understand that a while loop repeats as long as a boolean condition is true
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Parts of a While Loop:
        // Start with an initial value
        // Check the value if true-
        // Eventually change the value so the condition is false


        //Example: Code that loops a specific number of times
        int x = 0;
        while(x < 10) {
            System.out.println(x + " Hello");
            x++;
        }

        //Example: Calculating the total reps (count), sum, and average
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = scan.nextInt();
        int count = 0;
        int sum = 0;

        while(num > -1) {
            sum = sum + num;
            count++;
            System.out.println("Enter a positive number: ");
            num = scan.nextInt();
        }

        System.out.println("Total " + sum);
        System.out.println("You entered " + count + " values.");
        System.out.println("Average " + (1.0)*sum / count);

        //Example: Giving the compiler a stopping value and counting the # of colors
        System.out.println("Enter your favorite color, QUIT to stop");

        String color = scan.nextLine(); 
        color = scan.nextLine(); 

        int countColors = 0;
        while(!(color.equals("QUIT"))) {
            countColors++;
            System.out.println("You entered: " + color);

            System.out.println("Enter your favorite color, QUIT to stop");
            color = scan.nextLine();
        }
        System.out.println("You entered " + countColors + " color(s).");

    }
}
