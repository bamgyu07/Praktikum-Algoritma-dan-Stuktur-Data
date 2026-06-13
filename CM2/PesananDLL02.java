package CM2;

import percobaan.nodePesanan2;

public class PesananDLL02 {
    NodePesanan02 head;
    NodePesanan02 tail;

    public void tambahPesanan(Pesanan pesananBaru) {
        NodePesanan02 newNode = new NodePesanan02(pesananBaru);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void manualSortByNama(){
        if (head == null || head.next == null) {
            return;
        }

        boolean swap;

        do {
            swap = false;
            NodePesanan02 current = head;
            while (current.next !=null){
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            }
        } while (swap);
    }

    public void cetakLaporanPesanan(){
        if(head == null){
            System.out.println("belum ada data pesanan");
            return;
        }

        manualSortByNama();

        System.out.printf("%-15s %-15s %-15s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Jumlah Pesanan", "Harga"); 

        NodePesanan02 current = head;
        while (current != null){
            System.out.printf("%-15d %-15s %-15s %-10d\n", 
                current.data.kodePesanan, current.data.namaPesanan, current.data.jumlahPesanan, current.data.harga);
                current = current.next;
        }
    
    }
    public int hitungTotalPendapatan() {
        if (head == null) {
            return 0;
        }

        int total = 0;
        NodePesanan02 current = head;

        while (current != null) {
            total += current.data.harga;
            current = current.next;
        }

        return total;
    }

    
}
