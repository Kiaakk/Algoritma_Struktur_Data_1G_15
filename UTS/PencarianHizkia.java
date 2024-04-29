package UTS;

public class PencarianHizkia {
    SiswaHizkia listHizkia[] = new SiswaHizkia[6];
    int idxHizkia;

    void add(SiswaHizkia m) {
        if (idxHizkia < listHizkia.length) {
            listHizkia[idxHizkia] = m;
            idxHizkia++;
        } else {
            System.out.println("The dataset is complete");
        }
    }

    void displayHizkia() {
        bubbleSort();
        for (SiswaHizkia m : listHizkia) {
            m.displaySiswaHizkia();
        }
    }

    void displayHizkiax() {
        for (SiswaHizkia m : listHizkia) {
            m.displaySiswaHizkia();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listHizkia.length - 1; i++) {
            for (int j = 0; j < listHizkia.length - i - 1; j++) {
                if (listHizkia[j].tahunHizkia < listHizkia[j + 1].tahunHizkia) {
                    SiswaHizkia tmp = listHizkia[j];
                    listHizkia[j] = listHizkia[j + 1];
                    listHizkia[j + 1] = tmp;
                }
            }
        }
    }
    

    int binHizkia(String search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            int result = search.compareTo(listHizkia[mid].namaHizkia);
            if (result == 0) {
                return mid;

            } else if (result < 0) {
                return binHizkia(search, left, mid - 1);
            } else {
                return binHizkia(search, mid + 1, right);
            }
        }
        return -1;
    }

    void displayPositionSiswaHizkia(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " is found at indeks " + pos);
        } else {
            System.out.println("data " + x + " not found");
        }
    }

    void displayData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nama \t : " + listHizkia[pos].namaHizkia);
            System.out.println("NISN \t : " + listHizkia[pos].nisnHizkia);
            System.out.println("Alamat \t : " + listHizkia[pos].alamatHizkia);
            System.out.println("Tahun \t : " + listHizkia[pos].tahunHizkia);
            System.out.println("Nilai \t : " + listHizkia[pos].nilaiHizkia);
        } else {
            System.out.println("data " + x + " not found");
        }
    }



}