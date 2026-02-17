package videokod;

public class Book_53 {
    String title;
    int pages;

    Book_53(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}
