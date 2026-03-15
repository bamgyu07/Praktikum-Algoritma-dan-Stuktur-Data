package BruteForceDivideConquer.tugas;

public class MainNilaiMhs {
    public static void main(String[] args) {
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMhs mhs = new NilaiMhs(uts, uas);

        int maxUTS = mhs.nilaiMax(uts, 0, uts.length - 1);
        int minUTS = mhs.nilaiMin(uts, 0, uts.length - 1);
        double rataUAS = mhs.hitungRata();

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}