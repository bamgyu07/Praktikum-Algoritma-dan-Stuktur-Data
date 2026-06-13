package percobaan;

public class pesananDLL {
    nodePesanan2 head;
    nodePesanan2 tail;

    public void tambahPesanan(pesanan pesananBaru) {
        nodePesanan2 newNode = new nodePesanan2(pesananBaru);
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
            nodePesanan2 current = head;
            while (current.next !=null){
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            }
        } while (swap);
    }

    public void manualSortByHarga(){ //terkecil
        if (head == null || head.next == null) {
            return;
        }

        boolean swap;

        do {
            swap = false;
            nodePesanan2 current = head;
            while (current.next !=null){
                if (current.data.harga < current.next.data.harga) { //tinggal balik < ke > buat ke terbesar
                    pesanan temp = current.data;
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

        System.out.printf("%-15s %-15s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga"); 

        nodePesanan2 current = head;
        while (current != null){
            System.out.printf("%-15d %-15s %-10d\n", 
                current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
                current = current.next;
        }
    }

    public int hitungTotalPendapatan() {
        if (head == null) {
            return 0;
        }

        int total = 0;
        nodePesanan2 current = head;

        while (current != null) {
            total += current.data.harga;
            current = current.next;
        }

        return total;
    }

    public void catakLaporanHarga(){
        if (head == null){
            System.out.println("belum ada pesanan");
            return;
        }

        manualSortByHarga();

        System.out.printf("%-15s %-15s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga"); 

        nodePesanan2 current = head;
        while (current != null){
            System.out.printf("%-15d %-15s %-10d\n", 
                current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
                current = current.next;
        }

    }
}
