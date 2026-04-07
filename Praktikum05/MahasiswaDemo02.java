package Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa02 mahasiswa = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(mahasiswa);
        }

        System.out.println("\nData Mahasiswa sebelum diurutkan:");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah diurutkan (Bubble Sort):");
        list.bubbleSort();
        list.tampil();
    }
}
