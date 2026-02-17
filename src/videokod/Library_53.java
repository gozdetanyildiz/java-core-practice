package videokod;

public class Library_53 {

    String name;
    int year;
    Book_53[] books;

    Library_53(String name, int year, Book_53[] books){  //!!
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available:");

        for (Book_53 book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
