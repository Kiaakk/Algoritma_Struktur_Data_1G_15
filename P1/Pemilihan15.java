package P1;

import java.util.Scanner;

public class Pemilihan15 {

    static Scanner input15 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        double tugas = 0, kuis = 0, uts = 0, uas = 0, nilaiAkhir = 0;
        String nilaiHuruf = "", keterangan = "";

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input15.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input15.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        uts = input15.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        uas = input15.nextDouble();

        System.out.println("===============================");
        System.out.println("===============================");

        if (tugas >= 0 && kuis >= 0 && uts >= 0 && uas >= 0 && tugas <= 100 && kuis <= 100 && uts <= 100 && uas <= 100) {
            nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                keterangan = "LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                keterangan = "TIDAK LULUS";
            } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                keterangan = "TIDAK LULUS";
            }
        } else {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.println("Nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai huruf : " + nilaiHuruf);

        System.out.println("===============================");
        System.out.println("===============================");

        System.out.println("SELAMAT ANDA " + keterangan);
    }
}
