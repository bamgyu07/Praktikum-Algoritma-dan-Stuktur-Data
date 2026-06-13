package percobaan;

public class nodePembeli2 {
    pembeli data;
    int noAntrian;
    nodePembeli2 next;
    nodePembeli2 prev;

    public nodePembeli2() {
    }

    public nodePembeli2 (pembeli data, int noAntrian) {
        this.data = data;
        this.noAntrian = noAntrian;
        this.next = null;
        this.prev = null;
    }

}
