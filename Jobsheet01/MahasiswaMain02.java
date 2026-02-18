package Jobsheet01;

public class MahasiswaMain02 {
    public static void main(String[] args) {
        Mahasiswa02 mhs1 = new Mahasiswa02();
        mhs1.nama = "Aliyah Mafazah";
        mhs1.nim = "254107060049";
        mhs1.kelas = "SIB 1C";
        mhs1.ipk = 3.8;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 1C");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();
    }
}
