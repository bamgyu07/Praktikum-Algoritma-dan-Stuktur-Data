package CM2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int jumlahPesanan;
    int harga;

    public Pesanan() {
    }

    public Pesanan(int kodePesanan, String namaPesanan, int harga, int jumlahPesanan) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.jumlahPesanan = jumlahPesanan;
        this.harga = harga;
    }
}
