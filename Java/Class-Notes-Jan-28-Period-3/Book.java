public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String t, String a, int y) 
    {
        title = t;
        author = a;
        year = y;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "\ttitle: " + title + "\n\twritten by: " + author + "\n\tdate published: " + year;
    }

    public boolean equals(Book other) {
        if (title.equals(other.getTitle()) && author.equals(other.getAuthor()) && year == other.getYear())
            return true;
        return false;
    }

    public void setTitle(String str){
        title = str;
    }

    public void setAuthor(String str) {
        author = str;
    }

    public void setYear(int num) {
        year = num;
    }
}