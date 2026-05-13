package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {

    public static Mahasiswa02 inputMahasiswa02(Scanner sc) {
        System.out.println("                       ");
        System.out.print("Masukkan NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas\t: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK\t: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList02 list = new DoubleLinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data dari depan");
            System.out.println("7. Tampilkan data dari belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhsAwal = inputMahasiswa02(sc);
                    list.addFirst(mhsAwal);
                    break;
                
                case 2:
                    Mahasiswa02 mhsAkhir = inputMahasiswa02(sc);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.print("Masukkan data baru: ");
                    Mahasiswa02 dataBaru = inputMahasiswa02(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 4:
                    System.out.println("Data berhasil dihapus");
                    System.out.println(
                        "NIM\t: " + list.head.data.nim + 
                        "Nama\t: " + list.head.data.nama +
                        "Kelas\t: " + list.head.data.kelas +
                        "IPK\t: " + list.head.data.ipk
                        );
                    list.removeFirst();
                    break;

                case 5:
                    System.out.println("Data berhasil dihapus");
                    System.out.println(
                        "NIM\t: " + list.tail.data.nim + 
                        "\nNama\t: " + list.tail.data.nama +
                        "\nKelas\t: " + list.tail.data.kelas +
                        "\nIPK\t: " + list.tail.data.ipk
                        );
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;
                
                case 7:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            } 
        } while (pilihan != 0);
    }
}
