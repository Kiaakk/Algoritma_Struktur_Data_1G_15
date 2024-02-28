package P3.LatihanPraktikum;

public class LimasSegiEmpat15 {
    double psAlas;
    double tinggiLimas;

    public double hitungLuasPermukaanLSE() { // LSE = Limas Segi Empat
        double luasAlas = psAlas * psAlas; // mencari luasAlas terlebih dahulu
        double kelilingAlas = 4 * psAlas; // mencari kelilingAlas terlebih dahulu 

        double luasPermukaan = luasAlas + 0.5 * kelilingAlas * tinggiLimas; // mencari luas permukaan dengan luas alas dan keliling yang telah dicari di awal
        return luasPermukaan;
    }

    public double hitungVolumeLSE() {
        double volume = (psAlas * psAlas * tinggiLimas) / 3; // menghitung volume limas
        return volume;
    }
}
