package P6;

public class mainhotel {
    public static void main(String[] args) {

        hotelservice list = new hotelservice();
        hotel h1 = new hotel("Pacific Palace", "Batam", 1700000, Byte.valueOf("4"));
        hotel h2 = new hotel("Harbour Bay", "Batam", 500000, Byte.valueOf("3"));
        hotel h3 = new hotel("Montigo Resort", "Batam", 750000, Byte.valueOf("2"));
        hotel h4 = new hotel("Turi Beach Resort", "Batam", 1600000, Byte.valueOf("5"));

        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);

        System.out.println("=================================================================================");
        System.out.println("Listed below are the hotels previously sorted according to their pricing and star.");
        System.out.println("=================================================================================");
        list.showAll();

        System.out.println("=================================================================================");
        System.out.println("Listed below are the hotels sorted according to their pricing. (bubble sort)");
        System.out.println("=================================================================================");
        list.bubbleSortPrice();
        list.showAll();

        System.out.println();
        System.out.println();

        System.out.println("=================================================================================");
        System.out.println("Listed below are the hotels sorted according to their star. (bubble sort)");
        System.out.println("=================================================================================");
        list.bubbleSortStar();
        list.showAll();

        System.out.println();
        System.out.println();

        System.out.println("=================================================================================");
        System.out.println("Listed below are the hotels sorted according to their pricing. (selection sort)");
        System.out.println("=================================================================================");
        list.selectionSortPrice();
        list.showAll();

        System.out.println();
        System.out.println();

        System.out.println("=================================================================================");
        System.out.println("Listed below are the hotels sorted according to their star. (selection sort)");
        System.out.println("=================================================================================");
        list.selectionSortStar();
        list.showAll();
    }
}
