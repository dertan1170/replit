import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //Part #1
    System.out.println("This is the Halloween costume Generator!");
    System.out.println("What is your budget?");
    double budget = scan.nextDouble();
    System.out.println("What is your age?");
    int age = scan.nextInt();
    if (budget <= 30 && age <= 5)
      System.out.println("You should dress up as a ghost for Halloween");
    else if (budget <= 30 && age <= 8)
      System.out.println("You should be an prince/princess for Halloween");
    else if (budget <= 30 && age > 8)
      System.out.println("You should be a wizard/witch for Halloween");
    else if (budget > 30 && age <= 5)
      System.out.println("You should dress up a your favorite disney character for Halloween");
    else if (budget > 30 && age <= 8)
      System.out.println("You should be an monster for Halloween");
    else if (budget > 30 && age > 8)
      System.out.println("You should be an astronaut for Halloween");

    //Part #2
    
    System.out.println("You enter the maze, do you go right, left, or straight? (right/left/straight)");
    String start = scan.nextLine();

    if(start.equals("right"))
    System.out.println("Oh no you've accidentally fallen into a covered hole!");
    else if (start.equals("left")) {
    System.out.println("After walking for an absurdly long time you can either go down a path to the right or continue to go straght. (right/straight)");
    String left1 = scan.nextLine();
    if (left1.equals("right"))
    System.out.println("The path leads you straight into a ghost and as a result you faint!");
    else if (left1.equals("stright")) {
    System.out.println("You begin to see a light in the distance do you keep going? (foward/retreat)");
    String left2 = scan.nextLine();
    if (left2.equals("foward"))
    System.out.println("After deciding to go forward you all of a sudden find yourself back at the entrence of the maze and the light being the lamps that lit up the entrance.");
    else if (left2.equals("retreat"))
    System.out.println("When you turn around everything turns black and your consciousness fades.");
    }
    }
    else if (start.equals("straight")) {
    System.out.println("Going straight leads you to another choice go right, left, or straight? (right/left/straight)");
    String straight1 = scan.nextLine();
    if (straight1.equals("right"))
    System.out.println("Congratulations, you made it out of the maze!");
    else if (straight1.equals("left"))
    System.out.println("All of a sudden a swarm of bats attack you!");
    else if (straight1.equals("right"))
    System.out.println("Oh no, you reached a dead end!");
    }
    else
    System.out.println("You can't decide what to do and all of a sudden you're attacked and killed by a bear!");
  }
}
