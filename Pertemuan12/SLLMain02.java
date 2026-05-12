package Pertemuan12;

import java.util.Scanner;

public class SLLMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList02 sll = new SingleLinkedList02();
        
        System.out.print("Masukkan Data Mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("                   ");
            sc.nextLine(); 

            Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("               ");
        System.out.println("data index 1 : ");
        sll.getData(1); 
        
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon")); 
        System.out.println();
        
        sll.removeFirst(); 
        sll.removeLast(); 
        sll.print();
        
        sll.removeAt(0);
        sll.print();
    }
}
