package P8;

import java.util.Scanner;

public class utama15 {

    static Scanner kiak = new Scanner(System.in);
    public static void main(String[] args) {
        
        gudang15 gudang = new gudang15(7);

        boolean kiaganteng = true;

        while (kiaganteng) {
            System.out.println("Menu:");
            System.out.println("1. Tambang barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = kiak.nextInt();
            kiak.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = kiak.nextInt();
                    kiak.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = kiak.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = kiak.nextLine();
                    barang15 barangBaru = new barang15(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    System.out.println();
                    break;

                case 2:
                    gudang.ambilBarang();
                    System.out.println();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    System.out.println();
                    break;

                case 4: 
                    kiaganteng = false;
                    break;                
            
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    System.out.println();
                    continue;
            }
            
        }
    }
}
