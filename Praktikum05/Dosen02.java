package Praktikum05;

public class Dosen02 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen02() {
    }

    Dosen02(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
    }
}


