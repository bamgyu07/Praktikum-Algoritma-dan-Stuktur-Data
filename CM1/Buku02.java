package CM1;

public class Buku02 {
    String kodeBuku;
    String judul;
    String tahunTerbit;
    String penerbit; 

    Buku02(){
    }

    Buku02(String kodeBuku, String judul, String tahunTerbit, String penerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
    }

    void tampilBuku(){
        System.out.println("Kode: " + kodeBuku + ", Judul: " + judul + "\t, Tahun: " + tahunTerbit + "\t " + "\t, Penerbit: " + penerbit);
    }
}
