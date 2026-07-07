package day2;

public class MainLibrary {
    public static void main(String[] args) {
        Library lib = new Library(5);

        Book b1 = new Book("Java", "Smith", 2020);
        Book b2 = new Book("Python", "Brown", 2021);
        Book b3 = new Book("C++", "Johnson", 2019);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        System.out.println("All books:");
        lib.displayAllBooks();

        System.out.println("Searching for 'Java':");
        Book found = lib.findBookByTitle("Java");
        if (found != null) {
            found.display();
        } else {
            System.out.println("Book not found");
        }
    }
}