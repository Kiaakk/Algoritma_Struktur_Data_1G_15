package P4.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat15 {
    public static void main(String[] args) {
        
        Scanner kia = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = kia.nextInt();

        Pangkat15[] png = new Pangkat15[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = kia.nextInt();

            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = kia.nextInt();
            png[i] = new Pangkat15(nilai, pangkat);
        }

        System.out.println("==================================");
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("==================================");
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        kia.close();
    }
}
