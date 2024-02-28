package P3.LatihanPraktikum;

public class Mahasiswa15 {
    String nama;
    long nim;
    String gender;
    double ipk;

    public double hitungRatarata(Mahasiswa15[] mahasiswaArray) {
        double totalIPK = 0;
        for (Mahasiswa15 mahasiswa : mahasiswaArray) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mahasiswaArray.length;
    }

    public Mahasiswa15 hitungIpkTertinggi(Mahasiswa15[] mahasiswaArray) {
        Mahasiswa15 ipkTertinggi = mahasiswaArray[0];
        for (Mahasiswa15 mahasiswa : mahasiswaArray) {
            if (mahasiswa.ipk > ipkTertinggi.ipk) {
                ipkTertinggi = mahasiswa;
            }
        }
        return ipkTertinggi;
    }

}
