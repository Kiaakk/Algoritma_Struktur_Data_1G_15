package P2;

public class BukuMain15 {
    public static void main(String[] args) {
        
        // Buku15 bk1 = new Buku15();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;

        // bk1.tampilInformasi();
        // bk1.terjual(5);
        // bk1.gantiHarga(60000);
        // bk1.tampilInformasi();

        Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        System.out.println("======Sebelum terjual======");
        bk2.tampilInformasi();
        bk2.terjual(11);
        bk2.hitungHargaTotal();
        System.out.println("======Setelah terjual======");
        bk2.tampilInformasi();

        Buku15 Kiak = new Buku15("Attack on Titan", "Raffi Ahmad", 150, 10, 60000);
        System.out.println("======Sebelum terjual======");
        Kiak.tampilInformasi();
        Kiak.terjual(6);
        Kiak.hitungHargaTotal();
        System.out.println("======Setelah terjual======");
        Kiak.tampilInformasi();
    }
}
