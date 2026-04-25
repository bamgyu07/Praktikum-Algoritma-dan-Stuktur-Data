package CM1;

public class Mahasiswa02 {
    String nim;
    String nama;
    String prodi;
    String HP;

    Mahasiswa02(){
    }

    Mahasiswa02(String nim, String nama, String prodi, String hp){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.HP = hp;
    }

    void tampilInformasi(){
        System.out.println("NIM: " + nim + ", Nama: " + nama + "\t" + ", Prodi: " + prodi + ", Nomor Hp: " + HP);
    }
}
