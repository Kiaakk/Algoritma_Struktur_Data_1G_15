package P3.LatihanPraktikum;

import java.util.*;

public class BangunRuang15 {
    public static void main(String[] args) {
        
            Scanner kiak = new Scanner(System.in);
    
            Bola15[] arrayBola = new Bola15[2];
            Kerucut15[] arrayKerucut = new Kerucut15[2];
            LimasSegiEmpat15[] arrayLimas = new LimasSegiEmpat15[2];
    
            for (int i = 0; i < 2; i++) {
                System.out.println("Bola ke-" + (i + 1));
                System.out.print("Masukkanjari-jari bola          : ");
                double rbola = kiak.nextDouble();
                arrayBola[i] = new Bola15();
                arrayBola[i].r = rbola;
    
                System.out.println("\nKerucut ke-" + (i + 1));
                System.out.print("Masukkan jari-jari kerucut      : ");
                double rKerucut = kiak.nextDouble();
                System.out.print("Masukkan tinggi selimut kerucut : ");
                double tinggiSelimutKerucut = kiak.nextDouble();
                arrayKerucut[i] = new Kerucut15();
                arrayKerucut[i].r = rKerucut;
                arrayKerucut[i].s = tinggiSelimutKerucut;
    
                System.out.println("\nLimas ke-" + (i + 1));
                System.out.print("Masukkan panjang sisi alas limas: ");
                double panjangSisiAlasLimas = kiak.nextDouble();
                System.out.print("Masukkan tinggi limas           : ");
                double tinggiLimas = kiak.nextDouble();
                arrayLimas[i] = new LimasSegiEmpat15();
                arrayLimas[i].psAlas = panjangSisiAlasLimas;
                arrayLimas[i].tinggiLimas = tinggiLimas;
                System.out.println();
            }

            System.out.println("==========================");
            System.out.println("\nHasil perhitungan :");
            for (int i = 0; i < 2; i++) {
                System.out.println("Bola ke-" + (i + 1));
                System.out.println("Luas Permukaan : " + arrayBola[i].hitungLuasPermukaanBola());
                System.out.println("Volume         : " + arrayBola[i].hitungVolumeBola());
    
                System.out.println("\nKerucut ke-" + (i + 1));
                System.out.println("Luas Permukaan : " + arrayKerucut[i].hitungLuasPermukaanKerucut());
                System.out.println("Volume         : " + arrayKerucut[i].hitungVolumeKerucut());
    
                System.out.println("\nLimas ke-" + (i + 1));
                System.out.println("Luas Permukaan : " + arrayLimas[i].hitungLuasPermukaanLSE());
                System.out.println("Volume         : " + arrayLimas[i].hitungVolumeLSE());
    
                System.out.println("\n--------------------------");
            }
            kiak.close();
        }
    }

