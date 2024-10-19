import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //Part #1&2
    System.out.print("\nEnter your first name: ");
    String first = scan.nextLine();
    System.out.print("Enter your middle name: ");
    String middle = scan.nextLine();
    System.out.print("Enter your last name: "); 
    String last = scan.nextLine();
    String fullName = first+" "+middle+" "+last;
    System.out.println("Your full name is "+fullName);
    System.out.println("The length of your name is "+fullName.length());
    System.out.println("Your initials are "+first.substring(0,1)+middle.substring(0,1)+last.substring(0,1));
    
    //Part #3
    System.out.print("\nEnter an integer between 1,000 and 999,999, with the comma: ");
    String int1 = scan.nextLine();
    System.out.println(int1.substring(0,int1.indexOf(","))+int1.substring(int1.indexOf(",")+1));
    
    //Part #4
    System.out.print("\nEnter in a 10 digit phone number: ");
    String phone = scan.nextLine();
    System.out.println("("+phone.substring(0,3)+") "+phone.substring(3,6)+" - "+phone.substring(6));
    
    //Part #5
    System.out.println("\nThis program will take two differnet words and will output a result that will inform you which one is alphabetically first or if they are the same word.");
    System.out.print("Please input the first word: ");
    String alp1 = scan.nextLine();
		System.out.print("Please input the second word: ");
    String alp2 = scan.nextLine();
		System.out.println("\nIf the follwing integer is a\nnegative - the first word is alphabetically first\npositive - the second word is alphabetically first\nzero - the words are the same");
    System.out.println("Output: "+alp1.compareTo(alp2));
  }
}




