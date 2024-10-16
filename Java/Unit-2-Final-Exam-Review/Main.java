import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //#1
    System.out.println("\nPlease enter a string:");
    String str1 = scan.nextLine();
    String str2 = "";
    for(int i = 0; i<str1.length();i++){
      if(str1.substring(i,i+1).equals("0")||str1.substring(i,i+1).equals("1")||str1.substring(i,i+1).equals("2")||str1.substring(i,i+1).equals("3")||str1.substring(i,i+1).equals("4")||str1.substring(i,i+1).equals("5")||str1.substring(i,i+1).equals("6")||str1.substring(i,i+1).equals("7")||str1.substring(i,i+1).equals("8")||str1.substring(i,i+1).equals("9")){
        str2+="*";
    }
      else
        str2+=str1.substring(i,i+1);
    }
    System.out.println(str2);
    
    //#2
    System.out.println("\nPlease enter a string:");
    String str3 = scan.nextLine();
    System.out.println(str3.substring(1,str3.length()-1));
    
    //#3
    System.out.println("\nPlease enter a string:");
    String str4 = scan.nextLine();
    System.out.println(str4.substring(str4.length()/2,str4.length())+str4.substring(0,str4.length()/2));
    
    //#4
    System.out.println("\nPlease enter three integers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();
    if(num1<num2&&num2<num3)
      System.out.println("increasing");
    else if(num1>num2&&num2>num3)
      System.out.println("decreasing");
    else
      System.out.println("neither");
    
    //#5
    System.out.println("\nPlease enter a value for the radius:");
    double rad = scan.nextDouble();
    System.out.println("Please enter a value for the height:");
    double height = scan.nextDouble();
    System.out.println("The volume for a right circular cone is "+(Math.PI*Math.pow(rad,2)*(height/3)));
    
    //#6
    System.out.println("\nRandom numbers between 21 and 35:");
    for(int i=0;i<10;i++)
      System.out.println((int)(15*Math.random())+21);

  }
}