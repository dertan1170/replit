/* Unit 1 - Lesson 6: Numeric Casts
Lesson Overview: This lesson introduces casting, the process of converting one data type to another.

Lesson Objectives:
 + Perform casts between int and double data types in both directions
 + Understand the difference between a widening conversion and a narrowing conversion
 + Understand how doubles are truncated when they are converted to ints.
*/
public class Main {
    public static void main(String[] args) {
        //Part 1: Illegal Variables, Narrowing Conversions, & Widening Coversions
        int x1 = 7;
        System.out.println(x1);

        int x2 = (int) 8.2; //Narrowing Conversion double --> int
        System.out.println(x2); //truncate 8.2 --> 8

        int x3 = (int) 9.0; //Narrowing Conversion double --> int
        System.out.println(x3); //truncate 9.0 to 9

        double x4 = 18; //Widening Conversion int --> double 
        System.out.println(x4); //add .0 to the end

        //Part 2 - Casting from int to a double
        int a = 15;
        double halfA = (double) a / 2;
        System.out.println(halfA);

        //Part 3 - Practice Problem
        //Prompt: Come up with a formula that can be used on both m and n so that m rounds down to 17 and n rounds up to 23
        
        double m = 17.3;
        int m2 = (int) m;
        System.out.println(m2);

        double n = 22.5;
        n = n + 1;
        int n2 = (int) n;
        System.out.println(n2);

      
        double m1 = 17.3;
        double n1 = 22.7;

        System.out.println((int)(m1 + 0.5));  //should print 17 (round down)
        System.out.println((int)(n1 + 0.5)); //should print 23 (round up)

    }
}
