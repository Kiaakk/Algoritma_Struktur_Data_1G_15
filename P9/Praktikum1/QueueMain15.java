package P9.Praktikum1;

import java.util.Scanner;

public class QueueMain15 {

    static Scanner kiak = new Scanner(System.in);

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        
        System.out.print("Masukkan kapasitas queue: ");
        int n = kiak.nextInt();

        Queue15 q = new Queue15(n);
        int pilih;

        do {
            menu();
            pilih = kiak.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = kiak.nextInt();
                    q.Enqueue(dataMasuk);
                    break;
            
                case 2:
                    int dataKeluar = q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peek();
                    break;

                case 5: 
                    q.clear();
                    break;

                default:
                    break;
            }
        } while (pilih ==1 || pilih ==2 || pilih == 3 || pilih == 4 || pilih ==5);
    }
}
