package percobaan;

import Jobsheet12.Node02;

public class antrianDLL {
    nodePembeli2 head;
    nodePembeli2 tail;
    int noAntrian = 1;

    public antrianDLL() {
        this.head = null;
        this.tail = null;
        this.noAntrian = 1;
    }

    public void tambahAntrian(String nama, String noHp) {
        pembeli pembeli = new pembeli(nama, noHp);
        nodePembeli2 newNode = new nodePembeli2(pembeli, noAntrian);
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

        System.out.printf("%-12s %-15s %-15s \n", "No Antrian", "Nama Pembeli", "No HP");
        
        nodePembeli2 current = head;

        while (current != null) {
            System.out.printf("%-12d %-15s %-15s \n", 
            current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    public nodePembeli2 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian Kosong");
            return null;
        }

        nodePembeli2 temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return temp;
    }

    public int jumlahAntrian(){
        int total = 0;

        nodePembeli2 current = head;

        while (current != null){
            total++;
            current = current.next;
        }

        return total;
    }

    public void printReverse() {
        if (head == null) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        nodePembeli2 current = tail;

        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama Pembeli", "No HP");
        
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", 
            current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.prev;
        }
    }

    public void insertAfter(String keyNamaPembeli, pembeli data) {
        nodePembeli2 current = head;
        while (current != null && !current.data.namaPembeli.equals(keyNamaPembeli)) {
            current = current.next;
        }
        if (current == null){
            System.out.println("Data dengan NIM " + keyNamaPembeli + " tidak ditemukan.");
            return;
        } 
        
        nodePembeli2 newNode = new nodePembeli2();

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNamaPembeli);
    }
}