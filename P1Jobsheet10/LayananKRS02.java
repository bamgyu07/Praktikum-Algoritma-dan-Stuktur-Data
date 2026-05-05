package P1Jobsheet10;

import java.util.Scanner;

public class LayananKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS02 antrian = new AntrianKRS02(10);
        int pilih;

        do {
            System.out.println("\n--- Menu Antrian KRS ---");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layanan KRS");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Cetak Statistik Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.layaniKRS();
                    break;
                
                case 3:
                    antrian.tampilkanSemua();
                    break;
                
                case 4:
                    antrian.tampilDepan();
                    break;

                case 5:
                    antrian.tampilAkhir();
                    break;

                case 6:
                    antrian.cetakStatistik();
                    break;

                case 7:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
    }
    
}
