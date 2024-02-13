package P1;

import java.util.Scanner;

public class Perulangan15 {

    static Scanner input15 = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Masukkan NIM: ");
        long nim = input15.nextLong();

        int n = (int) (nim % 100);

        if (n < 10) {
            n = n + 10; // atau bisa n += 10
        } 

        System.out.println("n: " + n);
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}