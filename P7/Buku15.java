package P7;

public class Buku15 {
    int stock, publicationYear;
    String bookTitle, author, bookCode;

    Buku15(String bc, String bt, int py, String au, int st) {
        bookCode = bc;
        bookTitle = bt;
        publicationYear = py;
        author = au;
        stock = st;
    }

    void displayBookData() {
        System.out.println("=================================");
        System.out.println("Book code \t\t : " + bookCode);
        System.out.println("Book title \t\t : " + bookTitle);
        System.out.println("Publication year \t : " + publicationYear);
        System.out.println("Author \t\t\t : " + author);
        System.out.println("Stock \t\t\t : " + stock);
    }

}
