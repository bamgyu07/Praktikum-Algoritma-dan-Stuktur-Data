package CM1;

import java.util.Scanner;

public class PeminjamanMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        Mahasiswa02 [] mhs = {
            new Mahasiswa02("22001", "Andi", "Tehnik Informatika", "081"),
            new Mahasiswa02("22002", "Budi", "Tehnik Informatika", "082"),
            new Mahasiswa02("22003", "Citra", "Sistem Informasi Bisnis", "083")
        };

        Buku02 [] buku = {
            new Buku02("B001", "Algoritma", "2020", "Alya"),
            new Buku02("B002", "Basis Data", "2019", "Nanda"),
            new Buku02("B003", "Pemrograman", "2021", "Kinan"),
            new Buku02("B004", "Fisika", "2024", "Fiki")
        };

        Peminjaman02 [] peminjaman = {
            new Peminjaman02("22001", "Andi", "Algoritma", 7),
            new Peminjaman02("22002", "Budi", "Basis Data", 3),
            new Peminjaman02("22003", "Citra", "Pemrograman", 10),
            new Peminjaman02("22003", "Citra", "Fisika", 6),
            new Peminjaman02("22001", "Andi", "Basis Data", 4)
        };

        do {
            System.out.println(" === SISTEM PEMINJAMAN RUANG BACA JTI === ");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Bedadasarkan Denda");
            System.out.println("5. Cari Bedasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("                        ");
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa02 m : mhs) {
                        m.tampilInformasi();
                    }
                    System.out.println("                        ");
                    break;

                case 2:
                    System.out.println("                        ");
                    System.out.println("Daftar Buku: ");
                    for (Buku02 b : buku) {
                        b.tampilBuku();
                    }
                    System.out.println("                        ");
                    break;
                
                case 3:
                    System.out.println("                        ");
                    System.out.println("Data Peminjam: ");
                    for (Peminjaman02 p : peminjaman) {
                        p.tampilPeminjaman();
                    }
                    System.out.println("                        ");
                    break;
                    
                case 4:
                    System.out.println("                        ");
                    
                    System.out.println("Setelah diurutkan (berdasarkan denda terbesar): ");
                    for (Peminjaman02 p : peminjaman) {
                        p.selectionSort(peminjaman);
                    }
                    for (Peminjaman02 p : peminjaman) {
                        p.tampilPeminjaman();
                    }
                    System.out.println("                        ");
                    break;

                
                case 5:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String nimCari = sc.nextLine();
                    for (Peminjaman02 p : peminjaman) {
                        if (p.nim == Integer.parseInt(nimCari)) {
                            p.tampilPeminjaman();
                        }
                    }
                    System.out.println("                        ");
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem peminjaman ruang baca JTI!");
                    break;
        }       } while (pilihan != 0);
    }
}

