package Praktikum03;

public class DataDosen02 {
    public void dataAllDosen(Dosen02[] dataDosen) {
        int no = 0;
        for (Dosen02 dosen : dataDosen) {
            System.out.println("Data dosen ke-" + (no++));
            System.out.println("Kode Dosen    : " + dosen.kode);
            System.out.println("Nama Dosen    : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.tampilJenisKelamin());
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------");
        }
    }

    public void jmlDosenPerJenisKelamin(Dosen02[] dataDosen) {
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen02 dosen : dataDosen) {
            if (dosen.jenisKelamin) {
                jmlPria++;
            } else {
                jmlWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria: " + jmlPria);
        System.out.println("Jumlah Dosen Wanita: " + jmlWanita);
    }

    public void dataDosenTua(Dosen02[] arrayOfDosen){
        Dosen02 dosenTua = arrayOfDosen[0];
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("Kode Dosen    : " + dosenTua.kode);
        System.out.println("Nama Dosen    : " + dosenTua.nama);
        System.out.println("Jenis Kelamin : " + dosenTua.tampilJenisKelamin());
        System.out.println("Usia Dosen : " + dosenTua.usia);
    }

    public void dataDosenMuda(Dosen02[] arrayOfDosen){
        Dosen02 dosenMuda = arrayOfDosen[0];
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("Kode Dosen    : " + dosenMuda.kode);
        System.out.println("Nama Dosen    : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin : " + dosenMuda.tampilJenisKelamin());
        System.out.println("Usia Dosen : " + dosenMuda.usia);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] dataDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jmlPria = 0;
        int jmlWanita = 0;

        for (Dosen02 dosen : dataDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jmlWanita++;
            }
        }

        double rataRataUsiaPria = jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0;
        double rataRataUsiaWanita = jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0;

        System.out.println("Rata-rata usia dosen pria: " + rataRataUsiaPria);
        System.out.println("Rata-rata usia dosen wanita: " + rataRataUsiaWanita);
    }
}
