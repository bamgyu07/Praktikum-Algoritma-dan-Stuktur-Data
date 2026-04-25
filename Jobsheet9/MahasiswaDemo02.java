package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);

        do {
            System.out.println("\n=== Menu Tugas Mahasiswa ===");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("0. Keluar"); 
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // 

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM  : ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai untuk " + dinilai.nama + " (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine(); 
                        dinilai.tugasDinilai(nilai); 
                        System.out.printf("Tugas %s adalah %d\n", dinilai.nama, nilai);
                    } 
                    break;

                case 3:
                    Mahasiswa lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas teratas: " + lihat.nama);
                    }
                    break;
                
                case 4:
                    System.out.println("\n--- Daftar Semua Tugas ---");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <=4); 
    }
}