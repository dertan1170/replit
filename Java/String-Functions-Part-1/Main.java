import java.util.Scanner;
/* Unit 2: Lesson 3 - String Functions

Lesson Intro: In this lesson, you will learn about some functions (method) in the String class.

Lesson Objectives: 
 ++Understand that a string is made up of characters which are stored with indices starting at 0 and increasing sequentially up to length-1
 ++Learn the purpose and behavior of several different functions from the String class and use these in code (indexOf & substring)
*/


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Part 1 - Length of a String (integer)
        //We can find the length of any String length()

        //Example - Length of the String & storing into a variable
        String name = "Jonathan";
        int lengthOfName = name.length();
        System.out.println("The length of " + name + " is " + lengthOfName);

        //Example - length without a variable
        String school = "Glen A Wilson HS";
        System.out.println("Length of " + school + " is " + school.length());

        //Task #1: Ask the user to input their favorite color. Print out the length of the color.
        System.out.println("What is your favorite color?");
        String favColor = scan.nextLine();
        System.out.println("The length of the word "+favColor+" is "+favColor.length());

        //Part 2 - indexOf()

        //  C   L   A   S   S   R   O   O   M
        //  0   1   2   3   4   5   6   7   8

        String animal = "monkey";
        int findK = animal.indexOf("k");
        int findKey = animal.indexOf("key");
        System.out.println("The k in monkey is located at: " + findK);
        System.out.println("The key in monkey is located at: " + findKey);

        //Example: Printing out all the letters of a word on a separate line. Use a second parameter if needed.
		String word = "happy";
		System.out.println("Breakdown of the word happy:");
		System.out.println(word.indexOf("h"));
		System.out.println(word.indexOf("a"));
		System.out.println(word.indexOf("p"));
		System.out.println(word.indexOf("p",3)); //Start looking at index 3
		System.out.println(word.indexOf("y"));

       //Task #2: Ask the user to enter their last name and find the index of 'j'. If it doesn't exist, that is okay.
       //Observations - capitalized letters are not the same as lowercase because of their ASCII values
       //If the letter does not exist the integer is -1
       System.out.println("Please enter your last name");
       String lastName = scan.nextLine();
       System.out.println("The index of \'j\' in "+lastName+" is "+lastName.indexOf("j"));

        //Part 3 - substring() method

        //Example - substring() starting parameter

        String sport = "hockey";
        String subSport = sport.substring(3);
        System.out.println("The substring of hockey starting at index 3 is: " + subSport);

        //Example - substring(starting index, ending index) - ending index means is not included
        String className = "History 101";
        String subClassName = className.substring(2, 7); //want to store "story"
        System.out.println(subClassName);

        //Task #3: ask the user to input their favorite musical artist. print out the last letter of the String by using the length() method. it should work for any input.
        System.out.println("Please input your favorite musical artist");
        String favArtist = scan.nextLine();
        System.out.println(favArtist.substring(favArtist.length()-1));
    
        // System.out.println("Last letter of " + artist + " is " + lastLetter);
        //  K   A   N   Y   E
        //  0   1   2   3   4
        // .length() = 5
        // .length() - 1 = 4
        System.out.println("Enter your favorite artists");
        String artist = scan.nextLine();
        
        int lastLetter = artist.length() - 1;
        System.out.println("Last letter of " + artist + " is " + artist.substring(lastLetter));

    }
}

