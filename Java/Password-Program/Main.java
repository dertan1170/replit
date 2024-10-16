import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nEnter your password: ");
    String pass = scan.nextLine();
    if (isPasswordValid(pass))
      System.out.println("Congratulations! Your password is valid!");
    else
      System.out.println("Sorry, your password is invalid. Please try again.");
  }

  public static boolean isPasswordValid(String pass){
    boolean rule1 = false;
    boolean rule2 = false;
    boolean rule3 = false;
    if (pass.length()>=8)
      rule1=true;
    for (int i1=0; i1<pass.length();i1++){
      if(pass.substring(i1,i1+1).equals(pass.substring(i1,i1+1).toUpperCase())&&pass.substring(i1,i1+1).equals(pass.substring(i1,i1+1).toLowerCase()))
        rule2=true;
      }
    if(pass.contains("0")||pass.contains("1")||pass.contains("2")||pass.contains("3")||pass.contains("4")||pass.contains("5")||pass.contains("6")||pass.contains("7")||pass.contains("8")||pass.contains("9"))
      rule3=true;
    /*
    System.out.println("1"+rule1);
    System.out.println("2"+rule2);
    System.out.println("3"+rule3);
    */
    if(rule1&&rule2&&rule3)
      return true;
    return false;
  }
}