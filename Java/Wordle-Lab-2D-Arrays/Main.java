import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
  
public class Main {

	public static void main(String[] args) {
		final String ANSI_RESET = "\u001B[0m";
		final String WHITE_TEXT = "\u001B[37m";
		final String GREEN_BACKGROUND = "\u001B[42m";
		final String YELLOW_BACKGROUND = "\u001B[43m";
		final String BLUE_BACKGROUND = "\u001B[44m";
		final String RED_BACKGROUND = "\u001B[41m";

		String answer = "";

		try{
	    BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"));
	    String line = reader.readLine();
	    List<String> words = new ArrayList<String>();
	    while(line != null) {
	        String[] wordsLine = line.split(" ");
	        for(String word : wordsLine) {
	            words.add(word);
	        }
	        line = reader.readLine();
	    }
	
	    Random rand = new Random(System.currentTimeMillis());
	    String randomWord = words.get(rand.nextInt(words.size()));
			answer = randomWord;
			answer = answer.toUpperCase();
		} catch (Exception e) {
		    System.out.println("dictionary file not found");
		}
    
		System.out.println("The answer is: " + answer);
		System.out.println(BLUE_BACKGROUND + "Welcome to WORDLE, you have 6 guesses to guess the 5 letter word!" + ANSI_RESET);

		/*Each time you implement one of the color codes, you need to reset to go back to no color with ANSI_RESET */

		//continue the code here
    Scanner scan = new Scanner(System.in);
    String [][] wordle = {{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"},{"-","-","-","-","-"}};
    for(int r=0;r<wordle.length;r++){
      for(int c=0;c<wordle[0].length;c++){
        System.out.print(wordle[r][c]+" ");
      }
      System.out.println();
    }
    System.out.println();

    //Main Code
    int row = 0;
    int green = 0;
    int gnum = 0;
    while(green!=5&&gnum!=6){
      green = 0;
      System.out.print("Enter guess "+(gnum+1)+": ");
      String guess = scan.nextLine().toUpperCase();
      //code to insert the guess into the 2D array
      for(int c=0;c<wordle[0].length;c++){
        wordle[row][c]=guess.substring(c,c+1);
      }
      //code that changes the background to green/yellow 
      for(int c=0;c<5;c++){
        if(wordle[row][c].equals(answer.substring(c,c+1))){
          wordle[row][c]=GREEN_BACKGROUND + guess.substring(c,c+1) + ANSI_RESET;
          green++;
        }
        else{
          for(int i=0;i<5;i++){
            if(wordle[row][c].equals(answer.substring(i,i+1))){
              wordle[row][c]=YELLOW_BACKGROUND + guess.substring(c,c+1) + ANSI_RESET;
            }
          }
        }
      }
      for(int r=0;r<wordle.length;r++){
        for(int c=0;c<wordle[0].length;c++){
          System.out.print(wordle[r][c]+" ");
        }
        System.out.println();
      }
      System.out.println();
      row++;
      gnum++;
    }
    if(green==5)
      System.out.println("Congratulations you guessed the word correctly! Number of guesses: "+gnum);
    else
      System.out.println("Sorry you did not guess the word correctly. The correct word was: "+answer);
    
	}
}

/*
	Color Name		Color code		Background Color		Background Color code
	BLACK					\u001B[30m		BLACK_BACKGROUND		\u001B[40m
	RED						\u001B[31m		RED_BACKGROUND			\u001B[41m
	GREEN					\u001B[32m		GREEN_BACKGROUND		\u001B[42m
	YELLOW				\u001B[33m		YELLOW_BACKGROUND		\u001B[43m
	BLUE					\u001B[34m		BLUE_BACKGROUND			\u001B[44m
	PURPLE				\u001B[35m		PURPLE_BACKGROUND		\u001B[45m
	CYAN					\u001B[36m		CYAN_BACKGROUND			\u001B[46m
	WHITE					\u001B[37m		WHITE_BACKGROUND		\u001B[47m
	*/
  
//Basic Guess Code
  /*
    System.out.print("Enter guess 1: ");
    String guess = scan.nextLine().toUpperCase();
    //code to insert the guess into the 2D array
    int row = 0;
    for(int c=0;c<wordle[0].length;c++){
      wordle[row][c]=guess.substring(c,c+1);
    }
    //code that changes the background to green/yellow 
    for(int c=0;c<5;c++){
      if(wordle[row][c].equals(answer.substring(c,c+1))){
        wordle[row][c]=GREEN_BACKGROUND + guess.substring(c,c+1) + ANSI_RESET;
      }
      else{
        for(int i=0;i<5;i++){
          if(wordle[row][c].equals(answer.substring(i,i+1))){
            wordle[row][c]=YELLOW_BACKGROUND + guess.substring(c,c+1) + ANSI_RESET;
          }
        }
      }
    }
    for(int r=0;r<wordle.length;r++){
      for(int c=0;c<wordle[0].length;c++){
        System.out.print(wordle[r][c]+" ");
      }
      System.out.println();
    }
    System.out.println();
  */