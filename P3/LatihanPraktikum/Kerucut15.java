package P3.LatihanPraktikum;

public class Kerucut15 {

    double phi = 3.14;
    double s;
    double r;
    
    public double hitungVolumeKerucut() {
        double tinggiKerucut = Math.sqrt((s * s) - (r * r)); // Math sqrt itu untuk menghitung akar
        double volume = (1.0 / 3.0) * phi * r * r * tinggiKerucut; // disini menghitung volume
        return volume;
    }

    public double hitungLuasPermukaanKerucut() {
        double luasPermukaan = phi * r * (r + s); // disini menghitung luasPermukaan
        return luasPermukaan;
    }
}

