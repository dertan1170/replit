import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nEnter an integer: ");
    int num = scan.nextInt();
    System.out.println();
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++){
        System.out.print("*");
      }
      System.out.print(" ");
      if(i==1||i==num){
        for (int i1 = 1; i1 <= num; i1++) {
          System.out.print("*");
        }
      }
      else{
        for (int i2 = 1; i2 <= num; i2++) {
          if(i2==1||i2==num)
          System.out.print("*");
          else
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}