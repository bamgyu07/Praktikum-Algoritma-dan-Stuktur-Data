package Pertemuan12;

public class Mahasiswa02 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("" + nama + " \t\t" + nim + " \t" + kelas + " \t" + ipk);
    }
}