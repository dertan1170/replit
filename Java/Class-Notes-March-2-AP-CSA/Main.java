import java.util.Scanner;
class Main {
  public static void main(String[] args) {

		/* Array of Strings */
		String[] names = {"Vanessa", "Michael", "Louis", "Ashley"};

		/* Print each name */
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		/* Print the first and last letter of each name */
		for(int i = 0; i < names.length; i++) {
			String first = names[i].substring(0, 1);
			String last = names[i].substring(names[i].length() - 1);
			System.out.println(first + " " + last);
		}

		/* Use the scanner to fill an array of Strings */
		Scanner scan = new Scanner(System.in);
		
    String[] colors = new String[5];
		
		for (int i = 0; i < colors.length; i++) {
		  System.out.print("Enter a color: ");
		  colors[i] = scan.nextLine();
		}
		System.out.println();
		
		for(int i = 0; i < colors.length; i++) {
			System.out.print(colors[i].toUpperCase() + " ");
		}

		//colors.length is the array size
		//colors[0] gives you the first color
		//colors[i].length() is the length of the current word
		//colors[colors.length - 1] gives you the last color
		//colors[i].substring(0) - gives you the first letter of a desired color
		//colors[i].substring(colors[i].length() - 1) - gives you the first letter of a desired color
		System.out.println();
		System.out.println("Number of colors in the list " + colors.length);
		System.out.println("First color " + colors[0]);
		System.out.println("Length of the first color " + colors[0].length()); 
		System.out.println("Last color " + colors[colors.length - 1]);
		System.out.println("First letter of the first color  " + colors[0].substring(0, 1));
		System.out.println("Last letter of the first color " + colors[0].substring(colors[0].length() - 1));
		
  }
}