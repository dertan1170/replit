import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\nThis is a magical oracle what will tell you your future.\nCaution not following the directions will have unforeseen consequences.");
    System.out.println("\nPlease enter a number between 1 and 10:");
    int num = scan.nextInt();
    if (num < 0) 
    System.out.println("..... wait, you have broken the rules..... face the punishment.\n\'you have died...\'");
    if (num > 10) 
    System.out.println("..... wait, you have broken the rules..... face the punishment.\n\'you have died...\'");
    else if (num < 5) 
    System.out.println("An unseen disaster will happen sometime today");
    else if (num > 5)
    System.out.println("You will discover something new today");
    else if (num == 5)
    System.out.println("Nothing exciting will happen to you today");
  }
}