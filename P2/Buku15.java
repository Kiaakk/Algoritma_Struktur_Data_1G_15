package P2;

public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga, sold, total;

    void tampilInformasi() {
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok      : " + stok);
        System.out.println("Harga          : Rp " + harga);
        System.out.println("Harga total    : Rp " + total);
        System.out.println("Diskon         : Rp " + hitungDiskon());
        System.out.println("Harga bayar    : Rp " + hitungHargaBayar());
    }

    void terjual(int jml) {
        if (stok>0) {
            stok-=jml;
            sold = jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        total = harga * sold;
        return total;
    }

    int hitungDiskon() {
        if (hitungHargaTotal() > 150000) {
            double diskon = hitungHargaTotal() * 0.12;
            int diskon2 = (int) diskon;
            return diskon2;
        } else if (hitungHargaTotal() > 75000 && hitungHargaTotal() <= 150000) {
            double diskon = hitungHargaTotal() * 0.05;
            int diskon2 = (int) diskon;
            return diskon2;
        } else {
            double diskon = 0;
            int diskon2 = (int) diskon;
            return diskon2;
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

    public Buku15() {

    }

    public Buku15(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}   


