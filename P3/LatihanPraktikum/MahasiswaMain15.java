package P3.LatihanPraktikum;

import java.util.*;

public class MahasiswaMain15 {
    public static void main(String[] args) {
        Scanner kiak = new Scanner(System.in);
        Mahasiswa15[] mahasiswaArray = new Mahasiswa15[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));

            Mahasiswa15 mahasiswa = new Mahasiswa15();

            System.out.print("Masukkan nama: ");
            mahasiswa.nama = kiak.nextLine();

            System.out.print("Masukkan nim: ");
            mahasiswa.nim = kiak.nextLong();
            kiak.nextLine(); 

            System.out.print("Masukkan jenis kelamin: ");
            mahasiswa.gender = kiak.nextLine();

            System.out.print("Masukkan ipk: ");
            mahasiswa.ipk = kiak.nextDouble();
            kiak.nextLine();  

            mahasiswaArray[i] = mahasiswa;
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("Nama          : " + mahasiswaArray[i].nama);
            System.out.println("NIM           : " + mahasiswaArray[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswaArray[i].gender);
            System.out.println("IPK           : " + mahasiswaArray[i].ipk);
        }

        System.out.println();

        double rataRata = mahasiswaArray[0].hitungRatarata(mahasiswaArray);
        System.out.println("\nRata-rata IPK mahasiswa: " + rataRata);

        Mahasiswa15 ipkTertinggi = mahasiswaArray[0].hitungIpkTertinggi(mahasiswaArray);
        System.out.println("\nData mahasiswa dengan IPK tertinggi:");
        System.out.println("Nama          : " + ipkTertinggi.nama);
        System.out.println("NIM           : " + ipkTertinggi.nim);
        System.out.println("Jenis Kelamin : " + ipkTertinggi.gender);
        System.out.println("IPK           : " + ipkTertinggi.ipk);



        kiak.close();
    }
}
