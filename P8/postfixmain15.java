package P8;

import java.util.Scanner;

public class postfixmain15 {
    public static void main(String[] args) {
        
        Scanner kiak = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infox) : ");
        Q = kiak.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        postfix15 post = new postfix15(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);

        kiak.close();
    }
}
