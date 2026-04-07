package Praktikum05;

import java.util.Scanner;

public class DosenMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen02 list = new DataDosen02();

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Dosen (ASC)");
            System.out.println("4. Urutkan Data Dosen (DSC)");
            System.out.println("5. Urutkan Data Dosen (Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.nextLine().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine(); 

                    Dosen02 dosen = new Dosen02(kode, nama, jenisKelamin, usia);
                    list.tambah(dosen);
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.sortingASC();
                    list.tampil();
                    break;
                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;
                case 5:
                    list.insertionSort();
                    list.tampil();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
