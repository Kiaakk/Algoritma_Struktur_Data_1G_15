package P6;

public class Main15 {
    public static void main(String[] args) {
        
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa15 m1 = new Mahasiswa15("Nusa", 2017, 25, 3);
        Mahasiswa15 m2 = new Mahasiswa15("Rara", 2012, 19, 4);
        Mahasiswa15 m3 = new Mahasiswa15("Dompu", 2018, 19, 3.5);
        Mahasiswa15 m4 = new Mahasiswa15("Abdul", 2017, 23, 2);
        Mahasiswa15 m5 = new Mahasiswa15("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        // list.bubbleSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

    }
}
