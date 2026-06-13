package percobaan;

public class nodePesanan2 {
    pesanan data;
    nodePesanan2 next;
    nodePesanan2 prev;

    public nodePesanan2() {
    }

    public nodePesanan2(pesanan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
