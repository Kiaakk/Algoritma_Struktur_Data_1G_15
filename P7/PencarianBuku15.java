package P7;

public class PencarianBuku15 {
    Buku15 listBk[] = new Buku15[5];
    int idx;

    void add(Buku15 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("The dataset is complete");
        }
    }

    void display() {
        for (Buku15 m : listBk) {
            m.displayBookData();
        }
    }

    // int findSeqSearch(int search) {
    //     int position = -1;
    //     for (int i = 0; i < listBk.length; i++) {
    //         if (listBk[i].bookCode == search) {
    //             position = i;
    //             break;
    //         }
    //     }
    //     return position;
    // }

    int findSeq(int search) {
        int position = -1;
        for (int i = 0; i < listBk.length; i++) {
            // Integer.parseInt untuk mengkonversi String menjadi int
            int bookCode2 = Integer.parseInt(listBk[i].bookCode);
            if (bookCode2 == search) {
                position = i;
                break;
            }
        }
        return position;
    }
 
    void displayPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " is found at indeks " + pos);
        } else {
            System.out.println("data " + x + " not found");
        }
    }

    void displayData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Book code \t\t : " + x);
            System.out.println("Book title \t\t : " + listBk[pos].bookTitle);
            System.out.println("Publication year \t : " + listBk[pos].publicationYear);
            System.out.println("Author \t\t\t : " + listBk[pos].author);
            System.out.println("Stock \t\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " not found");
        }
    }

    // Buku15 FindBuku(int search) {
    //     for (int i = 0; i < listBk.length; i++) {
    //         if (listBk[i].bookCode == search) {
    //             return listBk[i];
    //         }
    //     }
    //     return listBk[-1];
    // }

    // int findBinarySearch(int search, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (right + left) / 2;
    //         if (search == listBk[mid].bookCode) {
    //             return (mid);
    //         } else if (listBk[mid].bookCode < search){
    //             return findBinarySearch(search, left, mid - 1);
    //         } else {
    //             return findBinarySearch(search, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    int findBin(int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            // integer.paraseInt untuk mengkonversi dari String ke int
            int comResult = Integer.parseInt(listBk[mid].bookCode);
            if (comResult == search) {
                return mid;
            } else if (comResult > search ) {
                return findBin(search, left, mid - 1);
            } else {
                return findBin(search, mid + 1, right);
            }
        } 
        return -1;
    }

}
