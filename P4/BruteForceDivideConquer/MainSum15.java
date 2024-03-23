package P4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        Scanner kia = new Scanner(System.in);

        System.out.print("Banyak Perusahaan : ");
        int banyak = kia.nextInt();
        System.out.println();

        for (int i = 0; i < banyak; i++) {
            System.out.println("Peusahaan ke-" + (i+1));
            System.out.println("==================================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = kia.nextInt();

            Sum15 sm = new Sum15(elm);
            System.out.println("==================================================================");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan untung bulan ke- " + (j+1) + " = ");
                sm.keuntungan[j] = kia.nextDouble();
            }

            System.out.println("==================================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
            System.out.println("==================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + Math.round(sm.totalDC(sm.keuntungan, 0, sm.elemen-1) * 100.0) / 100.0 );
            System.out.println();
        }
        kia.close();
    }
}
