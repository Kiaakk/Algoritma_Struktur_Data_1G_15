package P13;

import java.util.Scanner;

public class GraphMain15 {

    static Scanner kiak = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // Graph15 gedung = new Graph15(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // Scanner kiak = new Scanner(System.in);
        // boolean lanjut = true;
        // while (lanjut) {
        //     System.out.println("Menu:");
        //     System.out.println("1. Cek gedung");
        //     System.out.println("0. Keluar");
        //     System.out.print("Pilih menu (0/1): ");
        //     int pilihan = kiak.nextInt();

        //     switch (pilihan) {
        //         case 1:
        //             System.out.print("Masukkan asal gedung (0-5): ");
        //             int asal = kiak.nextInt();
        //             System.out.print("Masukkan gedung tujuan (0-5): ");
        //             int tujuan = kiak.nextInt();

        //             if (asal < 0 || asal > 5 || tujuan < 0 || tujuan > 5) {
        //                 System.out.println("Gedung yang dimasukkan tidak valid. Masukkan gedung dalam rentang 0-5.");
        //             } else {
        //                 if (gedung.adjacency(asal, tujuan)) {
        //                     System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        //                 } else {
        //                     System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        //                 }
        //             }
        //             break;
        //         case 0:
        //             lanjut = false;
        //             System.out.println("Terima kasih telah menggunakan program.");
        //             break;
        //         default:
        //             System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
        //             break;
        //     }
        // }

        GraphMatriks15 gdg = new GraphMatriks15(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + ": InDegree = " + gdg.inDegree(i) + ", OutDegree = " + gdg.outDegree(i) + ", Total Degree = " + gdg.degree(i));
        }
    }
}
