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
            System.out.println("5. Melihat Mahasiswa yang menggumpulkan tugas pertama kali");
            System.out.println("6. Melihat Jumlah Tugas di Stack");
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
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.printf("Nilai Biner Tugas: " + biner);
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

                case 5:
                    Mahasiswa bawah = stack.peekBottom();
                        if (bawah != null){
                            System.out.println("Mahasiswa pertama yang mengumpulkan: " + bawah.nama);
                        }
                        break;

                case 6:
                    System.out.println("Jumlah tugas di stack saat ini: " + stack.getJumlahTugas());

                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
        } while (pilih >= 1 && pilih <=6); 
    }
}