import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Part #1
    int count = 0;
    double sum = 0;
    double price = 0;
    while (price <= 100){
      count++;
      System.out.print("\nEnter the price of product "+count+": $");
      price = scan.nextDouble();
      if(price <= 100){
      sum += price;
      }
    }
    if (count == 1)
      System.out.print("\nYour first item is too expensive.");
    else {
    count--;
    System.out.print("\nAverage cost of items 1-"+count+":\n$"+(sum/count));
    }

    //Part #2
    int hours = 0;
    int loop = 0;
    String day = "";
    while (loop == 0){
      if(hours < 30){
      System.out.print("\n\nEnter the number of hours you worked on Monday: ");
      hours+=scan.nextDouble();
      day="Monday";
      }
      if(hours < 30){
      System.out.print("\nEnter the number of hours you worked on Tuesday: ");
      hours+=scan.nextDouble();
      day="Tuesday";
      }
      if(hours < 30){
      System.out.print("\nEnter the number of hours you worked on Wednesday: ");
      hours+=scan.nextDouble();
      day="Wednesday";
      }
      if(hours < 30){
      System.out.print("\nEnter the number of hours you worked on Thursday: ");
      hours+=scan.nextDouble();
      day="Thursday";
      }
      if(hours < 30){
      System.out.print("\nEnter the number of hours you worked on Friday: ");
      hours+=scan.nextDouble();
      day="Friday";
      }
      if(hours < 30){
      System.out.print("\nEnter the number of hours you worked on Saturday: ");
      hours+=scan.nextDouble();
      day="Saturday";
      }
      if(hours < 30){
      System.out.print("\nEnter the number of hours you worked on Sunday: ");
      hours+=scan.nextDouble();
      day="Sunday";
      }
      loop = 1;
    }
    if(hours >= 30)
      System.out.println("\nYou worked 30 hours by "+day+".");
    else
      System.out.println("\nYou didn’t work 30 hours this week, you were short by "+(30-hours)+" hours.");
  }
}