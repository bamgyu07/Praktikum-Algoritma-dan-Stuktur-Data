package Praktikum05;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

        Mahasiswa02 m1 = new Mahasiswa02("111", "Ayu", "2C", 3.7);
        Mahasiswa02 m2 = new Mahasiswa02("222", "Dika", "2C", 3.0);
        Mahasiswa02 m3 = new Mahasiswa02("333", "Ila", "2C", 3.8);
        Mahasiswa02 m4 = new Mahasiswa02("444", "Susi", "2C", 3.1);
        Mahasiswa02 m5 = new Mahasiswa02("555", "Yayuk", "2C", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("--------------------");
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):  ");
        list.bubbleSort();
        list.tampil();

        System.out.println("--------------------");
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("--------------------");
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}
