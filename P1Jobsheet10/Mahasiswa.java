package P1Jobsheet10;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData(){
        System.out.printf("%-12s | %-15s | %-8s | %-5s\n", nim, nama, prodi, kelas);
    }
}
