package P2;

public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul " + judul);
        System.out.println("Pengarang " + pengarang);
        System.out.println("Jumlah halaman " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }

    void terjual(int jml) {
        stok-=jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
    }
}