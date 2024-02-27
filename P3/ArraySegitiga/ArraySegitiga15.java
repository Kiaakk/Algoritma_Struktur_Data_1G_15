package P3.ArraySegitiga;

public class ArraySegitiga15 {
    public static void main(String[] args) {
        Segitiga15 sgArray[] = new Segitiga15[4];
        sgArray[0] = new Segitiga15(10, 4);
        sgArray[1] = new Segitiga15(20, 10);
        sgArray[2] = new Segitiga15(15, 6);
        sgArray[3] = new Segitiga15(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i + ":");
            System.out.println("Alas: " + sgArray[i].alas + ", Tinggi: " + sgArray[i].tinggi);
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println();
        }
    }
}
