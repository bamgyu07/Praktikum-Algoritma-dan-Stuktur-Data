package Jobsheet9;

import java.util.Scanner;

public class SuratMain02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat02 stack = new StackSurat02(10);

        int pilih;

        do {
            System.out.println("                       ");
            System.out.println("--- Menu Surat Izin ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin Berdasarkan Nama");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (Sakit/Izin): ");
                    String jenisIzin = scan.nextLine();
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();

                    Surat02 surat = new Surat02(idSurat, namaMahasiswa, kelas, jenisIzin.charAt(0), durasi);
                    stack.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;

                case 2:
                    Surat02 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat " + diproses.idSurat + " milik " + diproses.namaMahasiswa + " telah divalidasi.");
                    }
                    break;
                
                case 3:
                    Surat02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir: " + lihat.namaMahasiswa + " (" + lihat.idSurat + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = scan.nextLine();
                    
                    stack.cariSurat(cariNama);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }

        } while (pilih != 0);
    }
}
