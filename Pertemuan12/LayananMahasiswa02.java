package Pertemuan12;

import java.util.Scanner;

public class LayananMahasiswa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Antrian: ");
        int max = sc.nextInt();
        Queue02 antrian = new Queue02(max);

        int pilihan;

        do{
            System.out.println("                   ");
            System.out.println("Menu Layanan Unit Mahasiswa ");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Antrian");
            System.out.println("3. Cek antrian terdepan dan terakhir");
            System.out.println("4. Cek jumlah antrian");
            System.out.println("5. Kosongkan antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();

                    Mhs02 mhs = new Mhs02(nim, nama, kelas, prodi);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    System.out.println("Jumlah antrian saat ini: " + antrian.size);
                    break;
                case 5:
                    while (!antrian.isEmpty()) {
                        antrian.dequeue();
                    }
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 6);
        
    }
}
