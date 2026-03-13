package BruteForceDivideConquer;

public class Faktorial {
    public static int faktorialBF(int n) {
        int fakto = 1;
        for(int i = 1; i <= n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }

    public static int faktorialDC(int n) {
        if(n == 1){
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}