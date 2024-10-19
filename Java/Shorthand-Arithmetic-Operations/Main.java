import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
       
        /* Part 1: Order of Operations
        // Mult / Division then Add/Sub
        int y = (4 + 5) / 2;

        /* Part 2: Shorthand arithmetic operations:*/
        int x = 0;
        x += 3; // x = x + 3
        x -= 2; // x = x - 2
        x *= 1; // x = x * 1
        x /= 2; // x = x / 2

        /* Part 3: Division in Java */
        int a = 5;
        System.out.println(a / 2); // 2 - logical error
        System.out.println(a / 2.0);

        // int / int = int
        // int / double = double
        // double / int = double
        // double / double = double

        int b = 3;
        int c = 2;
        System.out.println((1.0) * (b + c) / 2);

        /* Part 4: Coding prompt (Complete the prompt in your own workspace) */
        //Input 2 integers and find the average. Make sure your answer displays the decimal part of your answer.
          
        System.out.println("Please Input two integers:");
        int one = scan.nextInt();
        int two = scan.nextInt();    
        System.out.println("The average of these two integers is: "+(one+two)/2.0);
    }
}
