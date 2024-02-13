package P1;

import java.util.Scanner;

public class Array15 {

    static Scanner input15 = new Scanner(System.in);
    public static void main(String[] args) {

        String[] namaMatkul = new String[8];
        double[] nilaiMatkul = new double[8];
        byte[] bobotSks = new byte[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];

        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.print("Masukkan nama matkul ke-" + (i+1) + ": ");
            namaMatkul[i] = input15.nextLine();
            System.out.print("Nilai matkul " + namaMatkul[i] + ": ");
            nilaiMatkul[i] = input15.nextDouble();
            System.out.print("Bobot sks matkul " + namaMatkul[i] + ": ");
            bobotSks[i] = input15.nextByte();
            input15.nextLine();
        }

        for (int i = 0; i < namaMatkul.length; i++) {
            if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        double totalNilai = 0;
        for (int i = 0; i < bobotSks.length; i++) {
            totalNilai = (bobotSks[i]*nilaiSetara[i]) + totalNilai;
        }

        byte totalSks = 0;
        for (int i = 0; i < bobotSks.length; i++) {
            totalSks += bobotSks[i];
        }

        double ipSemester = totalNilai / totalSks;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println("Nilai angka untuk MK " + namaMatkul[i] + ": " + nilaiMatkul[i]);
        }
        
        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.printf("MK \t\t\t Nilai Angka \t\t Nilai Huruf \t\t Bobot Nilai \n");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-18s \t %-18s \t %-18s \t %-18s \n", namaMatkul[i], nilaiMatkul[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("=====================");
        System.out.println("IP : " + ipSemester);
    }
}
