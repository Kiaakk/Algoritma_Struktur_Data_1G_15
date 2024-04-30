package P8;

public class gudang15 {
    barang15[] tumpukan;
    int size;
    int top;

    gudang15(int kapasitas) {
        size = kapasitas;
        tumpukan = new barang15[kapasitas];
        top = -1;
    }

    boolean cekKosong() {
        if (top == -1 ) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(barang15 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang.");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh.");
        }
    }

    barang15 ambilBarang() {
        if (!cekKosong()) {
            barang15 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    barang15 lihatBarangTeratas() {
        if (!cekKosong()) {
            barang15 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    void tampilkanBarang() {
        // if (!cekKosong()) {
        //     System.out.println("Rincian tumpukan barang di Gudang:");
        //     for (int i = top; i >= 0; i--) {
        //         System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        //     }
        // } else {
        //    System.out.println("Tumpukan barang kosong."); 
        // }
    }
}
