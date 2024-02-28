package P3.LatihanPraktikum;

public class Bola15 {
    double phi = 3.14;
    double r;

    public double hitungLuasPermukaanBola() {
        double luasPermukaan = 4 * phi * r * r; //mencari luas permukaan bola
        return luasPermukaan;
    }

    public double hitungVolumeBola() {
        double volume = (4.0 / 3.0) * phi * r * r * r; // mencari volume bola
        return volume;
    }
}
