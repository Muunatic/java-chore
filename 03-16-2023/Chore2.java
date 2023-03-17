package pert6;
import java.util.*;

public class Chore2 {

    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.println("== Kasir Kasiran 2 ==");
        System.out.println("========================================");
        System.out.print("Total Harga: Rp. ");
        int harga = inputan.nextInt();
        System.out.print("Uang Dibayarkan: Rp. ");
        int bayar = inputan.nextInt();
        System.out.println("========================================");
        int kembalian = bayar - harga;

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        System.out.println("Kembalian:" + kembalian);
        System.out.println("Pecahan Kembalian:");
        for (int i = 0; i < pecahan.length; i++) {
            int kelipatan = kembalian / pecahan[i];
            if (kelipatan > 0) {
                System.out.println(kelipatan + " × " + pecahan[i]);
                kembalian %= pecahan[i];
            }
        }
        inputan.close();

    }

}
