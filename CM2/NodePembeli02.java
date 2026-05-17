package CM2;

public class NodePembeli02 {
    Pembeli data;
    int noAntrian;
    NodePembeli02 next;
    NodePembeli02 prev;

    public NodePembeli02() {
    }

    public NodePembeli02(Pembeli data, int noAntrian) {
        this.data = data;
        this.noAntrian = noAntrian;
        this.next = null;
        this.prev = null;
    }
}
