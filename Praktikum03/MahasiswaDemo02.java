package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        String dummy;

        for (int i=0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa02();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM \t: ");
            arrayOfMahasiswa[i].nim = input.nextLine();
            System.out.print("Nama \t: ");
            arrayOfMahasiswa[i].nama = input.nextLine();
            System.out.print("Kelas \t: ");
            arrayOfMahasiswa[i].kelas = input.nextLine();
            System.out.print("IPK \t: ");
            arrayOfMahasiswa[i].ipk = Double.parseDouble(input.nextLine());
            System.out.println("================================");
        }

        for (int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("================================");
        }
    }
}