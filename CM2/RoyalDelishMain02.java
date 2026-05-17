package CM2;

import java.util.Scanner;

public class RoyalDelishMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDLL02 dll = new AntrianDLL02();
        PesananDLL02 laporan = new PesananDLL02();

        int pilihan;
        do{
            System.out.println("===============================");
            System.out.println(" SISTEM ANTRIAN ROYAL DELISH ");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan){
                case 1:
                    System.out.print("Nama Pembeli \t: ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("No HP \t\t: ");
                    String noHp = sc.nextLine();
                    Pembeli pembeliBaru = new Pembeli(namaPembeli, noHp);
                    dll.tambahAntrian(namaPembeli, noHp);
                    break;
                
                case 2:
                    System.out.println("================================");
                    System.out.println("Daftar Antrian Pembeli");
                    System.out.println("================================");
                    dll.cetakAntrian();
                    break;

                case 3:
                    NodePembeli02 panggil = dll.hapusAntrian();
                    if (panggil == null){
                        System.out.println("Tidak ada antrian");
                    } else {
                        System.out.println("Pelanggan " + panggil.data.namaPembeli + " silahkan memesan");
                        System.out.print("Kode pesanan \t: ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan \t: ");
                        String menuPesanan = sc.nextLine();

                        System.out.print("Harga \t\t: ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan pesananBaru = new Pesanan(kodePesanan, menuPesanan, harga);
                        laporan.tambahPesanan(pesananBaru);

                        System.out.println(panggil.data.namaPembeli + " telah memesan " + menuPesanan);
                    }
                    break;

                case 4:
                    System.out.println("================================");
                    System.out.println("Laporan Pesanan (urutan bedasarkan nama pesanan)");
                    System.out.println("================================");
                    laporan.cetakLaporanPesanan();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian Royal Delish!");
                    break;
            }   
        } while (pilihan != 0);
    }
}
