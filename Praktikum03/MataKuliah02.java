package Praktikum03;

public class MataKuliah02 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah02(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;   
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;   
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode \t\t: " + kode);
        System.out.println("Nama \t\t: " + nama);
        System.out.println("sks \t\t: " + sks);
        System.out.println("Jumlah Jam \t: " + jumlahJam);
    }
}
