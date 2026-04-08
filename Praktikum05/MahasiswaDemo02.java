package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 

        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
        list.listMhs = new Mahasiswa02[jumMhs];


        for(int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------");

            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }

        System.out.println("Data Mahasiswa :");
        list.tampil();

        System.out.println("--------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");

        String cariString = sc.nextLine(); 
        double cari = Double.parseDouble(cariString);

        System.out.println("menggunakan sequential searching");
        int pss = list.sequentialSearching(cari);
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("--------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------");
        int pss2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}