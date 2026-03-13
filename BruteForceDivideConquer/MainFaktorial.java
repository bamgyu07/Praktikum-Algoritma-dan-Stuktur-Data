package BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai = input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai dengan faktorial: " + nilai + " menggunakan BF: " +fk.faktorialBF(nilai));
        System.out.println("Nilai dengan faktorial: " + nilai + " menggunakan DC: " +fk.faktorialDC(nilai));
    }
}
