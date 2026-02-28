package Praktikum03;

public class Dosen02 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen02(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilInfo() {
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Jenis Kelamin \t: " + jenisKelamin);
        System.out.println("Usia   \t\t: " + usia);
        System.out.println("----------------------------");
    }

    public String tampilJenisKelamin() {
        if (jenisKelamin) {
            return "Pria";
        } else {
            return "Wanita";
        }
    }
}
