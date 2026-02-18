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
        mhs1.updateIpk(3.9);
        mhs1.tampilkanInformasi();

        Mahasiswa02 mhs2 = new Mahasiswa02("Choi Beomgyu", "254107060050", 3.2, "SIB 1D");
        mhs2.updateIpk(3.7);
        mhs2.tampilkanInformasi();
    }
}
