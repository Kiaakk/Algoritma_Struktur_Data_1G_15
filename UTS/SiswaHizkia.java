package UTS;

public class SiswaHizkia {
    String nisnHizkia;
    String namaHizkia;
    String alamatHizkia;
    int tahunHizkia;
    double nilaiHizkia;

    SiswaHizkia(String nisn, String nm, String almt, int thn, double nilai) {
        nisnHizkia = nisn;
        namaHizkia = nm;
        alamatHizkia = almt;
        tahunHizkia = thn;
        nilaiHizkia = nilai;
    }

    void displaySiswaHizkia() {
        System.out.println("=================================");
        System.out.println("Nama \t : " + namaHizkia);
        System.out.println("NISN \t : " + nisnHizkia );
        System.out.println("Alamat \t : " + alamatHizkia);
        System.out.println("Tahun \t : " + tahunHizkia);
        System.out.println("Nilai \t : " + nilaiHizkia);
    }

    

}
