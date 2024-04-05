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

    int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].bookCode == search) {
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

}