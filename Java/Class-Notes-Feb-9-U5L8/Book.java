public class Book {

  private String title;
  private String author;
  private int year;
	
	/*Part 1: STATIC VARIABLES 

	A static variable means that only one copy exists for all objects of the class. All objects share this variable. 

	This variable can be helpful to keep track of the total number of objects.
	*/
  private static int numOfBooks = 0; //every time a new Book is made, the counter goes up by one. The count variable will be shared among all instances of the Book class. 
  private int bookID;

	/* Part 2: CONSTANT VARIABLES */
	private static final double salePrice = 2.99; //

  public Book(String title, String author, int year) 
  {
    numOfBooks++;
    bookID = numOfBooks;

		/* Part 3: this keyword */
    this.title = title;
    this.author = author;
    this.year = year;
		//utilize the this keyword when the parameter variable has the same name as the instance variable
		//breakdown:
		//this.instanceVariableName = parameterVariableName
  }
  
	public void setTitle(String t) {
		title = t;
	}

	public void setAuthor(String a) {
		author = a;
	}

	public void setYear(int y) {
		year = y;
	}

	public String toString() {
		return "Book ID: " + bookID + " out of " + numOfBooks + "\nTitle: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nPrice: $" + salePrice + "\n";
  }
}