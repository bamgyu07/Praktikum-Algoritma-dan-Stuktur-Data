package percobaan;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianDLL dll = new antrianDLL();
        pesananDLL laporan = new pesananDLL();

        dll.tambahAntrian("Ainra", "08224500000");
        dll.tambahAntrian("Danra", "08224511111");
        dll.tambahAntrian("Sanri", "08224522222");
        //dll.tambahAntrian("Vania", "08422234556")
        
        int pilihan;

        do{
            System.out.println("===============================");
            System.out.println(" SISTEM ANTRIAN ROYAL DELISH ");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Laporan Pesanan");
            //System.out.println("5. Hitung total antrian");
            //System.out.println("6. Catak secara terbalik");
            //System.out.println("7. Hitung total pendapatan");
            //System.out.println("8. Laporan Bedasarkan harga");
            System.out.println("9. Masukkan Antrian Setelah");
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
                    pembeli newPembeli = new pembeli(namaPembeli, noHp);
                    dll.tambahAntrian(namaPembeli, noHp);
                    break;
                
                case 2:
                    System.out.println("================================");
                    System.out.println("Daftar Antrian Pembeli");
                    System.out.println("================================");
                    dll.cetakAntrian();
                    break;

                case 3:
                    nodePembeli2 panggil = dll.hapusAntrian();
                    if (panggil == null){
                        System.out.println("Tidak ada antrian");
                    } else {
                        System.out.print("Kode pesanan \t: ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan \t: ");
                        String menuPesanan = sc.nextLine();

                        System.out.print("Harga \t\t: ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        pesanan pesananBaru = new pesanan(kodePesanan, menuPesanan, harga);
                        laporan.tambahPesanan(pesananBaru);

                        System.out.println(panggil.data.namaPembeli + " telah memesan " + menuPesanan + " dengan harga " + harga);
                    }
                    break;

                case 4:
                    System.out.println("================================");
                    System.out.println("Laporan Pesanan (urutan bedasarkan nama pesanan)");
                    System.out.println("================================");
                    laporan.cetakLaporanPesanan();
                    break;

                //case 5:
                    //System.out.println("===========================");
                    //System.out.println("Total antrian sekarang adalah " + dll.jumlahAntrian());

                //case 6:
                    //System.out.println("================================");
                    //System.out.println("Daftar Antrian Pembeli");
                    //System.out.println("================================");
                    //dll.printReverse();
                    //break;
                
                //case 7:
                    //System.out.println("Total Pendapatan");
                    //System.out.println("===============================");
                    //System.out.println("Total Pendapatan : Rp "+ laporan.hitungTotalPendapatan());
                    //break;
                
                //case 8:
                    //System.out.println("================================");
                    //System.out.println("Laporan Pesanan (urutan bedasarkan harga)");
                    //System.out.println("================================");
                    //laporan.catakLaporanHarga();
                    //break;

                case 9:

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian Royal Delish!");
                    break;
            }   
        } while (pilihan != 0);
    }
}
