package Jobsheet01;

public class DosenMain02 {
   public DosenMain02() {
   }

   public static void main(String[] args) {
      Dosen02 dosenDefault = new Dosen02();
      Dosen02 dosenKustom = new Dosen02("L002", "Prof. Johnson", false, "2015", "Rekayasa Perangkat Lunak");
      
      dosenDefault.cetak();
      dosenKustom.cetak();
      dosenKustom.ubahStatusAktif(true);
   }
}