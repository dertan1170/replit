import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //Question #1
    System.out.println("\nPlease input two doubles:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    System.out.println("The average of these two doubles is: "+average(num1, num2));
    
    //Question #2
    System.out.println("\nPlease input two doubles:");
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();
    System.out.println("The larger double is: "+larger(num3, num4));
    
    //Question #3
    System.out.println("\nPlease input a word:");
    String word = scan.nextLine();
    //I was forced to add lines 23-24 since a bug was occuring skipping the scanner code if there was only one
    String word1 = scan.nextLine();
    word=word1;
    if(duplicate(word))
      System.out.println("The word contains duplicate letters.");
    else
      System.out.println("The word doesn't contain duplicate letters.");
  }

  //Question #1
  public static double average(double num1, double num2){
  return (num1+num2)/2;
  }

  //Question #2
  public static double larger(double num1, double num2){
    if(num1>num2)
      return num1;
    else
      return num2;
  }

  //Question #3
  public static boolean duplicate(String word){
    for (int i=0;i<word.length()-1;i++){
      if (word.substring(i,i+1).equals(word.substring(i+1,i+2)))
        return true;
    }
    return false;
  }
}