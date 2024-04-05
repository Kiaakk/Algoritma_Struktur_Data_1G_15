package P7;

import java.util.Scanner;

public class BukuMain15 {
    public static void main(String[] args) {
        
        Scanner kiak = new Scanner(System.in);

        PencarianBuku15 data = new PencarianBuku15();
        int numOfBooks = 5;
        
        System.out.println("=======================================================================");
        System.out.println("Please input the book data in ascending order based on the book code : ");
        for (int i = 0; i < numOfBooks; i++) {
            System.out.println("=================================");
            System.out.print("Book code \t\t : ");
            int bookCode = kiak.nextInt();
            kiak.nextLine();
            System.out.print("Book title \t\t : ");
            String bookTitle = kiak.nextLine();
            System.out.print("Publication year \t : ");
            int publicationYear = kiak.nextInt();
            kiak.nextLine();
            System.out.print("Author \t\t\t : ");
            String author = kiak.nextLine();
            System.out.print("Stock \t\t\t : ");
            int stock = kiak.nextInt();

            Buku15 m = new Buku15(bookCode, bookTitle, publicationYear, author, stock);
            data.add(m);
        }
    
        System.out.println("============================================");
        System.out.println("The complete dataset of the book : ");
        data.display();

        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("Data search");
        System.out.println("Provide the book code you are searching for : ");
        System.out.print("Book code : ");
        int search = kiak.nextInt();
        System.out.println("Using sequential search");
        int posisi = data.findSeqSearch(search);
        data.displayPosition(search, posisi);
        
        kiak.close();

    }   
}
