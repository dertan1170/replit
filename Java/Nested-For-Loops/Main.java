/* Tuesday November 16th, 2021 */

public class Main {

    public static void main(String[] args) {
        //Prompt: Given the following String, use a for-loop to print the word backwards.
		/* Sample output: tnemtraped */

		System.out.println("\n\nExample 1");
		String word = "department";

        //Mine
        /*
        String back = "";
        for (int i=word.length(); i>0; i--){
            back+=word.substring(i-1,i);
        }
        System.out.println(back);
        */

        //Given Example
        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.substring(i, i+1));
        }

           //Prompt: Given the following String, print the word backwards 5 times.
		/*Sample output:
			tnemtrapmoc
			tnemtrapmoc
			tnemtrapmoc
			tnemtrapmoc
			tnemtrapmoc
		*/ 
        System.out.println("\n\nExample 2");
		String word2 = "compartment";
        
        //Mine
        /*
        int count = 0;
        while (count!=5){
            String back1 = "";
        for (int i=word2.length(); i>0; i--){
            back1+=word2.substring(i-1,i);
        }
        System.out.println(back1);
        count++;
        }
        */

        //Given Example
        for(int j = 0; j < 5; j++) {
            for(int i = word2.length() - 1; i >= 0; i--) {
                System.out.print(word2.substring(i, i+1));
            }
            System.out.println();
        }

        //Prompt: Write a nested for-loop and print out the values from 1 to 10 three times. The only variables you can have are the index variables, one print statement for the output, and one print statement for the new row.
		/*Sample Output:
		1 2 3 4 5 6 7 8 9 10 
		1 2 3 4 5 6 7 8 9 10 
		1 2 3 4 5 6 7 8 9 10 
		*/

        System.out.println("\nExample 3:");
        for (int j=0; j<3; j++){
            for (int i=1; i<=10; i++){
                 System.out.print(i+" ");
            }
            System.out.println();
        }

        //Prompt: Write 4 nested for-loop to print out the following patterns. The only variables you can have are the index variables, one print statement for the output, and one print statement for the new row.
		/*
		EXAMPLE 4:
		0 0 0 0 
		1 1 1 1 
		2 2 2 2 
		3 3 3 3 
        */
        System.out.println("\nExample 4:");
        int count1 = 0;
        for (int j=0; j<4; j++){
            for (int i=0; i<=3; i++){
                 System.out.print(count1+" ");
            }
            count1++;
            System.out.println();
        }
        /*
		EXAMPLE 5:
		1 2 3 4 
		1 2 3 4 
		1 2 3 4 
		1 2 3 4 
        */
        System.out.println("\nExample 5:");
        for (int j=0; j<4; j++){
            for (int i=1; i<=4; i++){
                 System.out.print(i+" ");
            }
            System.out.println();
        }
        /*
		EXAMPLE 6:
		1
		12
		123
		1234
        */
        System.out.println("\nExample 6:");
        for (int j=1; j<5; j++){
            for (int i=1; i<=j; i++){
                 System.out.print(i);
            }
            System.out.println();
        }
        /*
		EXAMPLE 7:
		1   2   3   4   5   6   7   8   9   10
		2   4   6   8   10  12  14  16  18  20
		3   6   9   12  15  18  21  24  27  30
		4   8   12  16  20  24  28  32  36  40
		5   10  15  20  25  30  35  40  45  50
		6   12  18  24  30  36  42  48  54  60
		7   14  21  28  35  42  49  56  63  70
		8   16  24  32  40  48  56  64  72  80
		9   18  27  36  45  54  63  72  81  90
		10  20  30  40  50  60  70  80  90  100
        */
        System.out.println("\nExample 7:");
        for (int j=1; j<11; j++){
            for (int i=j; i<=(j*10); i+=j){
                 System.out.print(i+"\t");
            }
            System.out.println();
        }

    } //end of main() method
} // end of Main class
