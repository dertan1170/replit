import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //#1
    System.out.println("\nWhat day is it?");
    String day = scan.nextLine().toLowerCase();
    System.out.println("Are you on vacation?(yes/no)");
    String vac = scan.nextLine().toLowerCase();

    if (day.equals("sunday")||day.equals("saturday")||vac.equals("yes"))
      System.out.println("\nYou can sleep in today.");
    else
      System.out.println("\nYou can't sleep in today.");

    //#2
    System.out.println("\nPlease enter two integer values:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    if (num1>0 && num2>0)
      System.out.println("\nBoth values are positive.");
    else if ((num1>0 && num2<0)||(num1<0 && num2>0))
      System.out.println("\nThe values are positive and negative.");
    else if (num1<0 && num2<0)
      System.out.println("Both values are negative");

    //#3
    System.out.println("\nPlease enter a positive integer value:");
    int num3 = scan.nextInt();
    if (num3%3==0 && num3%5==0)
      System.out.println("False");
    else if (num3%3==0)
      System.out.println("True");
    else if (num3%5==0)
      System.out.println("True");
    else
      System.out.println("False");
  }
}