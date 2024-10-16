/* Tuesday Jan 4th, 2021
U5L1: Void Methods

Lesson Intro: This lesson explains void methods, methods that don’t have a return statement.

Lesson Objectives:
 + Understand why methods can be a useful tool in programming
 + Learn the syntax for defining and calling a void method in Java

*/
public class Main {

    public static void main(String[] args) {
        for(int i =0; i < 5; i++) {
            printName();
        }

        //Song Lyrics for Easy on Me by Adele
        verse1();
        chorus();
        verse2();
        chorus();
        bridge();
        chorus();
    } // end of main() method

    /*‘Public’ indicates that other classes can access the method.
    ‘Void’ indicates that the method doesn’t return anything (you might remember this from unit 2). We’ll talk later about writing methods that return data.
    'Static' is a concept beyond the scope of this lesson and will be explained in Unit 5 Lesson 8.
    */
    
    public static void printName() {
        System.out.println("Mrs. Bushyeager");
    } // end of printName() method

    public static void verse1() {
        System.out.println("There ain't no gold in this river \nThat I've been washin' my hands in forever \nI know there is hope in these waters \nBut I can't bring myself to swim \nWhen I am drowning in this silence \nBaby, let me in");
    } // end of verse1() method
    
    public static void chorus() {
        System.out.println("\nGo easy on me, baby \nI was still a child \nDidn't get the chance to \nFeel the world around me \nI had no time to choose \nWhat I chose to do \nSo go easy on me");
    } // end of chorus() method

    public static void verse2() {
        System.out.println("\nThere ain't no room for things to change \nWhen we are both so deeply stuck in our ways \nYou can't deny how hard I have tried \nI changed who I was to put you both first \nBut now I give up");
    } // end of verse2() method
    
    public static void bridge() {
        System.out.println("\nI had good intentions \nAnd the highest hopes \nBut I know right now \nThat probably doesn't even show");
    } // end of bridge() method

} // end of Main class
