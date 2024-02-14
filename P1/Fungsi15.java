package P1;

public class Fungsi15 {
    public static void main(String[] args) {
        
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar =   10000;

        int[][] stock = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5},
            { 5, 7, 12, 9}
        };

        int aglonemaMati = 1, keladiMati = 2, alocasiaMati = 0, mawarMati = 5;

        pendapatan(hargaAglonema, hargaKeladi, hargaAlocasia, hargaMawar, stock); // memanggil fungsi untuk menghitung pendapatan
        jumlahStock(stock, 4, aglonemaMati, keladiMati, alocasiaMati, mawarMati); // memanggil fungsi untuk menghitung jumlah Stock
        
    }

    static void pendapatan(int hargaAglonema, int hargaKeladi, int hargaAlocasia, int hargaMawar, int[][] stock) {
        int[] pendapatan = new int[stock.length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                int hasil = 0;
                if (j == 0) {
                    hasil = stock[i][j] * hargaAglonema;
                } else if (j == 1) {
                    hasil = stock[i][j] * hargaKeladi;
                } else if (j == 2) {
                    hasil = stock[i][j] * hargaAlocasia;
                } else if (j == 3) {
                    hasil = stock[i][j] * hargaMawar;
                }
                pendapatan[i] += hasil;
            }
            System.out.println("Pendapatan RoyalGarden" + (i + 1) + " = " + pendapatan[i]);
        }
        System.out.println("================================");
        System.out.println("================================");
    }
    static void jumlahStock(int[][] stock, int toko, int aglonemaMati, int keladiMati, int alocasiaMati, int mawarMati) {
        int stockAglonema, stockKeladi, stockAlocasia, stockMawar;
        System.out.println("Jumlah stock bunga pada cabang RoyalGarden4");
        for (int i = 0; i < stock[toko - 1].length; i++) {
            if (i == 0) {
                stockAglonema = stock[toko - 1][i] - aglonemaMati;
                System.out.println("stock bunga Algonema : " + stockAglonema);
            } else if (i == 1) {
                stockKeladi = stock[toko - 1][i] - keladiMati;
                System.out.println("stock bunga Keladi   : " + stockKeladi);
            } else if (i == 2) {
                stockAlocasia = stock[toko - 1][i] - alocasiaMati;
                System.out.println("stock bunga Alocasia : " + stockAlocasia);
            } else if (i == 3) {
                stockMawar = stock[toko - 1][i] - mawarMati;
                System.out.println("stock bunga Mawar    : " + stockMawar);
            }
        }
    }
}
