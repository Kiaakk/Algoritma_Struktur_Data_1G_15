package UTS;

import java.util.Scanner;

public class MainHizkia {
    public static void main(String[] args) {

        Scanner kia = new Scanner(System.in);
        
        PencarianHizkia data = new PencarianHizkia();
        int numOfSiswa = 6;

        System.out.println("=================================");
        System.out.println("Masukkan data mahasiswa");
        System.out.println("=================================");
        System.out.println();

        for (int i = 0; i < numOfSiswa; i++) {
            System.out.println("=================================");
            System.out.println("Siswa ke-" + (i+1));
            System.out.println("=================================");
            System.out.print("Nama \t: ");
            String namaHizkiaa = kia.nextLine();
            System.out.print("NISN \t: ");
            String nisnHizkiaa = kia.nextLine();
            System.out.print("Alamat \t: ");
            String alamatHizkiaa = kia.nextLine();
            System.out.print("Tahun \t: ");
            int tahunHizkiaa = kia.nextInt();
            System.out.print("Nilai \t: ");
            int nilaiHizkiaa = kia.nextInt();
            kia.nextLine();
            System.out.println();

            SiswaHizkia m = new SiswaHizkia(nisnHizkiaa, namaHizkiaa, alamatHizkiaa, tahunHizkiaa, nilaiHizkiaa);
            data.add(m);
        }

        System.out.println("============================================");
        System.out.println("Daftar data mahasiswa (sebelum sorting): ");
        data.displayHizkiax();

        System.out.println("============================================");
        System.out.println("Daftar data mahasiswa (setelah sorting berdasarkan tahun terlama hingga terbaru): ");
        data.displayHizkia();

        System.out.println("============================================");
        System.out.println("============================================");
        System.out.println("Mencari siswa berdasarkan nama");
        System.out.print("Nama : ");
        String nameHizkia = kia.nextLine();

        System.out.println("=======================================");
        System.out.println("Using binary search");
        int position = data.binHizkia(nameHizkia, 0, numOfSiswa-1);
        data.displayPositionSiswaHizkia(nameHizkia, position);
        data.displayData(nameHizkia, position);
       
        kia.close();
    }
}
