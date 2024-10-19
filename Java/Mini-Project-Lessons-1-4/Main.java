import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  
  System.out.println("\nWelcome to our program. This is a restaraunt that will calculate your tax rate and we will automatically apply a $2 discount. Enter up to four meal prices; we only serve meals in integer prices!\n");
  
  System.out.print("Please enter the cost of your first meal: \n$");
  int num1 = scan.nextInt();
  
  System.out.print("\n"+"Please enter the cost of your second meal: \n$");
  int num2 = scan.nextInt();
  
  System.out.print("\nPlease enter the cost of your third meal: \n$");
  int num3 = scan.nextInt();

  System.out.print("\nPlease enter the cost of your fourth meal: \n$");
  int num4 = scan.nextInt();

  int total = num1 + num2 + num3 + num4;
  System.out.println("\nThe total cost pre-tax and pre-coupon is: $" + total + "\n");
  
  int avg;
  avg = (total/4);
  System.out.println("The average cost of your total rounded down is: $" + avg + "\n");
  
  total--;
  total--;
  double tax = total;
  tax*=0.0775;
  // 1.0775 tax 7.75%
  double finaltotal;
  finaltotal = (tax + total);
  
  System.out.println("The total cost with your coupon and tax applied: $" + finaltotal + "\n");
  }
}


