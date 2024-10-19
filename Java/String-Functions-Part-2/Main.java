import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		/* REVIEW:
		 + .length() - Returns an int, the number of chars in the string

		 + .indexOf(String str) - Returns the index of the first occurrence of str in the calling String

		 + .substring(int firstOneYouWant, int firstOneYouDontWant) - Returns the substring from the first int up to but not including the second
		 
		 + .substring(int firstOneYouWant) - Returns the substring from the specified index to the end
		*/

		/*Part 1: .compareTo(String otherString)
		 + Returns 0 if the strings are the same
		 + Returns a negative value if this string comes before otherString alphabetically
		 + Returns a positive value if this string comes after otherString alphabetically
		*/
		String str1 = "hello";
		String str2 = "help";
		String str3 = "hear";
		System.out.println(str1.compareTo(str2)); //'hello' comes before 'help' alphabetically --> -4
		System.out.println(str1.compareTo(str3)); //'hello' comes after 'hear' alphabetically --> 11 
		System.out.println(str1.compareTo("hello")); //0 equal

		/*Part 2: .toUpperCase()
		 + Transforms the string to uppercase
		 + Not tested on the AP exam, but very useful
		*/
		System.out.println(str3.toUpperCase());
		str2 = str2.toUpperCase();
		System.out.println(str2);

		/*Part 3: .toLowerCase()
		 + Transforms the string to lower case
		 + Not tested on the AP exam, but very useful
		*/
		System.out.println("CompuTer".toLowerCase());


		/*Part 4: .equals(String otherString)
		 + Tests if data stored in otherString is the same as this one
		 + Returns true or false
		*/
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equals(str3)); //false
		System.out.println(str1.equals("Hello")); //false
		System.out.println(str1.equals("hello")); //true
  }
}