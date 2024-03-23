package P4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
        
        Scanner kiak = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan jumlah elemen: ");
        int jmlE = kiak.nextInt();

        System.out.println("=============================");
        Faktorial15[] fk = new Faktorial15[jmlE];
        for (int i = 0; i < jmlE; i++) {
            fk[i] = new Faktorial15();
            System.out.print("Masukkan nilai data ke-" + (i+1) + ": ");
            fk[i].nilai = kiak.nextInt();
        }

        System.out.println("===================================================================================");
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < jmlE; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("===================================================================================");
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < jmlE; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }

        kiak.close();

    }
}
