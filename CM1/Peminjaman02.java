package CM1;

import java.util.ArrayList;

public class Peminjaman02 {
    int nim;
    String nama;
    String judulBuku;
    int lamaPinjam;
    int terlambat;
    int denda = 2000;
    int batasPinjam = 5;
    int jmlOrg;

    Peminjaman02(){
    }

    Peminjaman02(String nim, String nama, String judulBuku, int lamaPinjam){
        this.nim = Integer.parseInt(nim);
        this.nama = nama;
        this.judulBuku = judulBuku;
        this.lamaPinjam = lamaPinjam;
        this.terlambat = Math.max(0, (lamaPinjam - batasPinjam) * denda);
    }

    void tampilPeminjaman(){
        System.out.println(" " + nama + "\t|" + " " + judulBuku + "\t|" + " " + "Lama: " + lamaPinjam + " " + "\t|" + " " + "Denda: " + terlambat);
    }

    void bubbleSort(Peminjaman02 [] peminjaman) {
        Peminjaman02 temp;
        for (int i = 0; i < peminjaman.length - 1; i++) { 
            for (int j = 0; j < peminjaman.length - i - 1; j++) { 
                if (peminjaman[j].terlambat < peminjaman[j + 1].terlambat) { 
                    temp = peminjaman[j];
                    peminjaman[j] = peminjaman[j + 1]; 
                    peminjaman[j + 1] = temp; 
                }
            }
        }
    }

    void selectionSort(Peminjaman02 [] peminjaman) {
        for (int i = 0; i < peminjaman.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < peminjaman.length; j++) {
                if (peminjaman[j].terlambat > peminjaman[maxIdx].terlambat) {
                    maxIdx = j;
                }
            }
            Peminjaman02 temp = peminjaman[maxIdx];
            peminjaman[maxIdx] = peminjaman[i];
            peminjaman[i] = temp;
        }

        for (Peminjaman02 p : peminjaman) {
            if (p.terlambat > 0) {
                jmlOrg++;
            }
        }

        System.out.println("jumlah orang yang memiliki denda: " + jmlOrg);
    }

    void sequentialSearch(Peminjaman02 [] peminjaman, int nim) {
        boolean found = false;
        for (Peminjaman02 p : peminjaman) {
            if (p.nim == nim) {
                p.tampilPeminjaman();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    int findBinarySearch(Peminjaman02 [] peminjaman, double cari, int left, int right){
    int mid;
    if (right >= left){
        mid = (left + right) / 2;
        if (cari == peminjaman[mid].terlambat){
            return mid;
        } else if (peminjaman[mid].terlambat < cari){
            return findBinarySearch(peminjaman, cari, left, mid - 1);
        } else {
            return findBinarySearch(peminjaman, cari, mid + 1, right);
        }
        }
        return -1;
    }

    void tampil(){
        System.out.println(" " + nama + "\t|" + " " + judulBuku + "\t|" + " " + "Lama: " + lamaPinjam + " " + "\t|" + "Denda: " + terlambat);
    }
    void tampilPosisi(double x, int pos){
        if (pos!=-1){
            System.out.println("Data peminjaman dengan denda " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data peminjaman dengan denda " + x + " tidak ditemukan");
        }
    }
}
