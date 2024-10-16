public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Matilda", "Roald Dahl", 1988);
        
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getYear());

        System.out.println("All info:");
        System.out.println(b1.toString());

        Book b2 = new Book("Othello", "Shakespeare", 1603);
        System.out.println("All info:");
        System.out.println(b2.toString());

        Book b3 = new Book("Othello", "Shakespeare", 1603);

        System.out.println(b2==b3);

        System.out.println(b2.equals(b3));
        

        Book b4 = new Book("The Great Gatsby", "Fitzgareld", 1925);
        b4.setAuthor("Fitzgerald");
        System.out.println("All info:");
        System.out.println(b4.toString());
    }
}
