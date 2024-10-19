import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n- - - - Welcome to Rock-Paper-Scissors - - - -\n\nPlayer 1 will be the computer.\n\nPlayer 2 will be you.");
    System.out.print("\nHit Enter/Return to begin >");
    String start = scan.nextLine();
    int round = 1;
    int player1 = 0;
    int player2 = 0;
    int stop = 0;

    while (stop!=1) {
    System.out.println("\nRound "+round);
    System.out.println("Enter your choice (ROCK/PAPER/SCISSORS): ");
    String choice2 = scan.nextLine();
    int choice1 = (int)(Math.random()*3);
    
    if(choice2.toLowerCase().equals("rock")&&choice1 == 0)
    System.out.println("The computer also chose ROCK this round was a DRAW.");
    else if(choice2.toLowerCase().equals("rock")&&choice1 == 1){
    System.out.println("The computer chose PAPER you LOST.");
    player1++;
    }
    else if(choice2.toLowerCase().equals("rock")&&choice1 == 2){
    System.out.println("The computer chose SCISSORS you WON.");
    player2++;
    }
    else if(choice2.toLowerCase().equals("paper")&&choice1 == 0){
    System.out.println("The computer chose ROCK you WON.");
    player2++;
    }
    else if(choice2.toLowerCase().equals("paper")&&choice1 == 1)
    System.out.println("The computer also chose PAPER this round was a DRAW.");
    else if(choice2.toLowerCase().equals("paper")&&choice1 == 2){
    System.out.println("The computer chose SCISSORS you LOST.");
    player1++;
    }
    else if(choice2.toLowerCase().equals("scissors")&&choice1 == 0){
    System.out.println("The computer chose ROCK you LOST.");
    player1++;
    }
    else if(choice2.toLowerCase().equals("scissors")&&choice1 == 1){
    System.out.println("The computer chose PAPER you WON.");
    player2++;
    }
    else if(choice2.toLowerCase().equals("scissors")&&choice1 == 2)
    System.out.println("The computer also chose SCISSORS this round was a DRAW.");
    System.out.println("Player 1: "+player1+"\nPlayer 2: "+player2);
    round++;
    if(player1==3)
      System.out.println("Player 1 won, better luck next time.");
    else if (player2==3)
      System.out.println("Player 2 won, congratulations!");
    if(player1==3||player2==3){
    System.out.println("\nWould you like to play again?");
    String play = scan.nextLine();
    if(play.toLowerCase().equals("yes")){
      round = 1;
      player1 = 0;
      player2 = 0;
      }
    else
    stop++;
    }
  }
  }
}