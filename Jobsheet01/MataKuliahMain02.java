package Jobsheet01;

public class MataKuliahMain02 {
   public MataKuliahMain02() {
   }

   public static void main(String[] args) {
      MataKuliah02 mataKuliahDefault = new MataKuliah02();
      MataKuliah02 mataKuliahKustom = new MataKuliah02("CS102", "Struktur Data", 4, 60);
      
      mataKuliahDefault.cetak();
      mataKuliahKustom.cetak();
      mataKuliahKustom.ubahSks(5);
      mataKuliahKustom.tambahJam(5);
      mataKuliahKustom.kurangiJam(10);
   }
}