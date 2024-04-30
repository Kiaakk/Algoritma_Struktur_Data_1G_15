package P9.Praktikum2;

import java.util.Scanner;

public class QueueMain15 {

    static Scanner kiak = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan kapasitas queue: ");
        int max = kiak.nextInt();
        Queue15 antri = new Queue15(max);
        int pilih;

        do {
            menu();
            pilih = kiak.nextInt();

            switch (pilih) {
                case 1:
                    kiak.nextLine();
                    System.out.print("Masukkan No Rekening: ");
                    String norek = kiak.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = kiak.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = kiak.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = kiak.nextInt();
                    System.out.print("Masukkan saldo: ");
                    double saldo = kiak.nextDouble();
                    Nasabah15 nb = new Nasabah15(norek, nama, alamat, umur, saldo);
                    kiak.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah15 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("---------------------------");
    }
}
