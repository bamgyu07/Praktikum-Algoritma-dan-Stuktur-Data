package Praktikum03;

import java.util.Scanner;   

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = Integer.parseInt(sc.nextLine());

        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[jumlahMataKuliah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Kode \t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama \t\t: ");
            nama = sc.nextLine();
            System.out.print("SKS \t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam \t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------");

            arrayOfMataKuliah[i] = new MataKuliah02(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("----------------------------");
        }

        
    }
}
