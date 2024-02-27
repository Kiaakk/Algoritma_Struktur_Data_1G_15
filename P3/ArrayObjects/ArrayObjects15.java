package P3.ArrayObjects;

import java.util.Scanner;

public class ArrayObjects15 {
    
    static Scanner kiak = new Scanner(System.in);
    public static void main(String[] args) {
        int panjangArray;
        System.out.print("Banyak persegi panjang (array) : ");
        panjangArray = kiak.nextInt();
        PersegiPanjang15[] ppArray = new PersegiPanjang15[panjangArray];
        // Persegi15[] pgArray = new Persegi15[100];
        // pgArray[5].sisi = 20;
        
        for (int i = 0; i < panjangArray; i++) {
            ppArray[i] = new PersegiPanjang15();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = kiak.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = kiak.nextInt();
        }

        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
}
