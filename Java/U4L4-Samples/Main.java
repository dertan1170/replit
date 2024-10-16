class Main {
  public static void main(String[] args) {
		System.out.println("Part 1: Traversing a String");
    //Part 1: Traversing a String

		//Traverse means to go through every element of a string from front to end, or back to front. 

		String str = "computer";

		System.out.print("Traversing front to back: ");
		for (int i = 0; i < str.length(); i++) 	{
			System.out.print(str.substring(i, i + 1) + " ");
		}

		System.out.print("\nTraversing back to front: ");
		for(int i = str.length() - 1; i > 0; i--) {
			System.out.print(str.substring(i, i + 1) + " ");
		}

		//Part 2: Counting Substrings
		System.out.println("\n\nPart 2: Counting Substrings");

		//Example: Looking for a single letter
		int count = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.substring(i, i + 1).equals("e")) 
			{
				count++;
			}
		}
		System.out.println("The number of times 'e' appears in " + str + ": " + count);

		//Example: Looking for substrings
		int count2 = 0;
		for (int i = 0; i < str.length() - 2; i++) 
		{
			if (str.substring(i, i + 3).equals("put")) 
			{
				count2++;
			}
		}
		System.out.println("The number of times 'put' appears in " + str + ": " + count2);

		//Part 3: Concatenating Strings
		System.out.println("\n\nPart 3: Concatenating Strings");

		//Ex: Keep the original String, build a new String which is the reversal of the original.
		String str2 = "Glen A Wilson HS";
		String newStr = "";
		for (int i = str2.length(); i > 0; i--) 
		{
			newStr += str2.substring(i - 1, i);
		}
		System.out.println("Original String: " + str2);
		System.out.println("New String: " + newStr);

		//Part 4: Removing letters from a String
		System.out.println("\n\nPart 4: Removing letters from a String");
		String str3 = "Mississippi";
		String newStr2 = "";
		for (int i = 0; i < str3.length(); i++) 
		{
			if (!str3.substring(i, i + 1).equals("i")) 
			{
				newStr2 += str3.substring(i, i + 1);
			}
		}
		str3 = newStr2;

		System.out.println("The word Mississippi without the i's: " + str3);




  }
}