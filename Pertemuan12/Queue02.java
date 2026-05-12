package Pertemuan12;

import org.w3c.dom.Node;

public class Queue02 {
    NodeMhs02 head, tail;
    int size = 0;
    int max;

    public Queue02(int max) {
        this.max = max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Mhs02 data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            NodeMhs02 newNode = new NodeMhs02(data, null);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa berikut telah dilayani:");
            head.data.tampilInformasi();
            head = head.next;
            size--;
            if (head == null) tail = null;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.print("Paling Depan -> "); head.data.tampilInformasi();
            System.out.print("Paling Belakang -> "); tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            NodeMhs02 current = head;
            System.out.println("Isi Antrian:");
            while (current != null) {
                current.data.tampilInformasi();
                current = current.next;
            }
        }
    }

    void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
