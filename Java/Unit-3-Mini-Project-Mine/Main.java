import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input your name:");
    String name = scan.nextLine();
    System.out.println("Hello "+name+" please input your age as well:");
    int age = scan.nextInt();
    if (age < 0) 
    System.out.println("This is not a valid age");
    else if (age > 123)
    System.out.println("This is not a valid age");
    else if (age < 18)
    System.out.println("Since you're "+age+" years old you will still need to wait "+(18-age)+" years until you'll be considered an adult.");
    else
    System.out.println("Since you are "+age+" years old you are already considered an adult.");
  }
}