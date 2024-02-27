package P3.ArraySegitiga;

public class Segitiga15 {
    public int alas;
    public int tinggi;

    public Segitiga15(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi); //menggunakan library math utk mencari sisi miring
        double keliling = alas + tinggi + sisiMiring;
        return keliling;
    }

    public double hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }
}
