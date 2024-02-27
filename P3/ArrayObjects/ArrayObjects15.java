package P3.ArrayObjects;

import java.util.Scanner;

public class ArrayObjects15 {

    static Scanner kiak = new Scanner(System.in);
    public static void main(String[] args) {
        PersegiPanjang15[] ppArray = new PersegiPanjang15[3];
        
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang15();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = kiak.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = kiak.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
}
