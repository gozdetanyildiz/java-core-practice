package videokod;

public class Video53 {
    public static void main(String[] args) {

        Book_53 book1 = new Book_53("The Fellowship of the Ring", 423);
        Book_53 book2 = new Book_53("The Two Towers", 352);
        Book_53 book3 = new Book_53("The Return of the King", 416);

        Book_53[] books = {book1, book2, book3};

        Library_53 library = new Library_53("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}