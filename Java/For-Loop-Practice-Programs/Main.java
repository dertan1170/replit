import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    //Question #1
    System.out.print("\nThe squares between 1 and 100 are: ");
    double sum = 0;
    for (int i=1; i<=9; i++){
    System.out.print(Math.pow(i,2)+" ");
    sum += Math.pow(i,2);
    if(i==9){
      i = 10;
      System.out.print(Math.pow(i,2));
      sum += Math.pow(i,2);
      }
    }
    System.out.println("\nThe sum of the squares = "+sum);

    //Question #2
    System.out.print("\nEnter a word: ");
    String word = scan.nextLine();
    int vowel = 0;
    for(int i1 = 0; i1<word.length(); i1++){
      if (word.substring(i1,i1+1).equals("a")||word.substring(i1,i1+1).equals("e")||word.substring(i1,i1+1).equals("i")||word.substring(i1,i1+1).equals("o")||word.substring(i1,i1+1).equals("u"))
      vowel++;
    }
    System.out.println("The word "+word+" has "+vowel+" vowels.");

    //Question #3
    System.out.print("\nEnter a sentence: ");
    String sentence = scan.nextLine();
    int words = 0;
    for(int i2 = 0; i2<sentence.length(); i2++){
      if (sentence.substring(i2,i2+1).equals(" "))
        words++;
    }
    words++;
    System.out.println("The sentence contains "+words+" words.");

  }
}