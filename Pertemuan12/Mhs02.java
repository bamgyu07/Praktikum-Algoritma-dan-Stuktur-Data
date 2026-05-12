package Pertemuan12;

public class Mhs02 {
    String nim, nama, kelas, prodi;

    public Mhs02() {
    }

    public Mhs02(String nim, String nama, String kelas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    public void tampilInformasi() {
        System.out.println("" + nama + " \t\t" + nim + " \t" + kelas + " \t" + prodi);
    }
}
