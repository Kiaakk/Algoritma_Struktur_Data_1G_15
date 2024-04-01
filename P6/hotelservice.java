package P6;

public class hotelservice {
    hotel rooms[] = new hotel[4];
    int idx;
    
    void add(hotel m) {
        if (idx < rooms.length) {
            rooms[idx] = m;
            idx++;
        } else {
            System.out.println("The dataset is complete or contains all necessary information");
        }
    }

    void showAll() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Name \t : " + rooms[i].name);
            System.out.println("City \t : " + rooms[i].city);
            System.out.println("Price \t : " + rooms[i].price);
            System.out.println("Star \t : " + rooms[i].star);
            System.out.println();
        }
    }

    void bubbleSortPrice() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].price < rooms[j-1].price) {
                    hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void bubbleSortStar() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].star > rooms[j-1].star) {
                    hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSortPrice() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].price < rooms[idxMin].price) {
                    idxMin = j;
                }
            }
            hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }

    void selectionSortStar() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].star > rooms[idxMin].star) {
                    idxMin = j;
                }
            }
            hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }
}
