package BruteForceDivideConquer.tugas;

public class NilaiMhs {
    int[] nilaiUTS;
    int[] nilaiUAS;

    NilaiMhs(int[] uts, int[] uas){
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    public int nilaiMax(int[] arr, int kiri, int kanan){
        if(kiri == kanan){
            return arr[kiri];
        }

        int tengah = (kiri + kanan) / 2;
        int maxKiri = nilaiMax(arr, kiri, tengah);
        int maxKanan = nilaiMax(arr, tengah + 1, kanan);
        return Math.max(maxKiri, maxKanan);
    }

    public int nilaiMin(int[] arr, int kiri, int kanan){
        if(kiri == kanan){
            return arr[kiri];
        }

        int tengah = (kiri + kanan) / 2;
        int minKiri = nilaiMin(arr, kiri, tengah);
        int minKanan = nilaiMin(arr, tengah + 1, kanan);
        return Math.min(minKiri, minKanan);
    }

    public double hitungRata(){
        int jumlah = 0;

        for(int nilai : nilaiUAS){
            jumlah += nilai;
        }

        return (double) jumlah / nilaiUAS.length;
    }
}
