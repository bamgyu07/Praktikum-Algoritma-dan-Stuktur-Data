package CM2;

import Jobsheet12.Node02;

public class AntrianDLL02 {
    NodePembeli02 head;
    NodePembeli02 tail;
    int noAntrian;

    public AntrianDLL02() {
        this.head = null;
        this.tail = null;
        this.noAntrian = 1;
    }

    public void tambahAntrian(String nama, String noHp) {
        Pembeli pembeli = new Pembeli(nama, noHp);
        NodePembeli02 newNode = new NodePembeli02(pembeli, noAntrian);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor : " + noAntrian);
        noAntrian++;
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian Kosong");
            return;
        }

        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama Pembeli", "No HP");
        
        NodePembeli02 current = head;

        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
            current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    public NodePembeli02 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian Kosong");
            return null;
        }

        NodePembeli02 temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return temp;
    }

    public void hapusAntrian(int nomorHapus) {
    if (head == null) {
        System.out.println("Antrian kosong");
        return;
    }

    NodePembeli02 current = head;

    while (current != null &&
           current.noAntrian != nomorHapus) {
        current = current.next;
    }
    if (current == null) {

        System.out.println("Nomor antrean tidak ditemukan");
        return;
    }

    System.out.println("Antrian dihapus: " + nomorHapus);
    }
}