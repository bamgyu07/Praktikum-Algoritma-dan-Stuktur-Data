package Praktikum03;

import java.util.Scanner;
public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah yang ingin diinput: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        System.out.println("--------------------------------------");
        Dosen02[] arrayofDosen02 = new Dosen02[jumlahDosen];
        for(int i = 0; i < jumlahDosen; i++){
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode                       : ");
            String kode = sc.nextLine();
            System.out.print("Nama                       : ");
            String nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            Boolean jenisKelamin;
            if (jk.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else if (jk.equalsIgnoreCase("Wanita")) {
                jenisKelamin = false;
            } else {
                System.out.println("Error: Jenis kelamin hanya bisa 'Pria' atau 'Wanita'");
                i--; // ulangi input untuk dosen ini
                continue;
            }

            System.out.print("Usia                       : ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayofDosen02[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }

        DataDosen02 dataDosen = new DataDosen02();
        System.out.println("Semua Data Dosen ");
        dataDosen.dataAllDosen(arrayofDosen02);
        System.out.println("                           ");

        System.out.println("Jumlah Dosen Per Jenis Kelamin");
        dataDosen.jmlDosenPerJenisKelamin(arrayofDosen02);
        System.out.println("                           ");

        System.out.println("Rata-rata Usia Dosen Per Jenis Kelamin ");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayofDosen02);
        System.out.println("                           ");

        System.out.println("Dosen Tertua");
        dataDosen.dataDosenTua(arrayofDosen02);
        System.out.println("                           ");

        System.out.println("Dosen Termuda");
        dataDosen.dataDosenMuda(arrayofDosen02);
        System.out.println("                           ");
    }
}