package CM2;

public class NodePesanan02 {
    Pesanan data;
    NodePesanan02 next;
    NodePesanan02 prev;

    public NodePesanan02() {
    }

    public NodePesanan02(Pesanan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
