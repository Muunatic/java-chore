package pert6;
import java.util.*;

public class Chore1 {

    public static void main(String[] args) {
        
        Scanner inputan = new Scanner(System.in);
        System.out.println("== Kasir Kasiran ==");
        System.out.println("Akan mendapat diskon sebesar: ");
        System.out.println("5% jika belanja lebih dari Rp. 50000 ");
        System.out.println("10% jika belanja lebih dari Rp. 100000 ");
        System.out.println("========================================");
        System.out.print("Masukan jumlah barang: ");
        int barang = inputan.nextInt();
        System.out.print("Masukan jumlah harga barang: ");
        int hargaBarang = inputan.nextInt();
        System.out.println("========================================");
        int jumlah = barang * hargaBarang;

        if (jumlah >= 50000 && jumlah < 100000) {
            int resDiskon = 5;
            Double jumlahDiskon = Res.hitungDiskon(jumlah, resDiskon);
            System.out.println("Total Harga: Rp. " + jumlah);
            System.out.println("Diskon: " + resDiskon + "%");
            System.out.print("Masukan jumlah bayar: ");
            Double bayar = inputan.nextDouble();
            Double result = jumlahDiskon - bayar;
            System.out.println("Harus Dibayar: Rp. " + jumlahDiskon);
            System.out.println("========================================");
            System.out.println("Uang yang dibayarkan: Rp. " + bayar);
            System.out.println("Kembalian: " + result * -1);
            inputan.close();
            return;
        } else if (jumlah >= 100000) {
            int resDiskon = 10; 
            Double jumlahDiskon = Res.hitungDiskon(jumlah, resDiskon);
            System.out.println("Total Harga: Rp. " + jumlah);
            System.out.println("Diskon: " + resDiskon + "%");
            System.out.print("Masukan jumlah bayar: ");
            Double bayar = inputan.nextDouble();
            Double result = jumlahDiskon - bayar;
            System.out.println("Harus Dibayar: Rp. " + jumlahDiskon);
            System.out.println("========================================");
            System.out.println("Uang yang dibayarkan: Rp. " + bayar);
            System.out.println("Kembalian: " + result * -1);
            inputan.close();
            return; 
        } else {
            int resDiskon = 0; 
            Double jumlahDiskon = Res.hitungDiskon(jumlah, resDiskon);
            System.out.println("Total Harga: Rp. " + jumlah);
            System.out.println("Diskon: " + resDiskon + "%");
            System.out.print("Masukan jumlah bayar: ");
            Double bayar = inputan.nextDouble();
            Double result = jumlahDiskon - bayar;
            System.out.println("Harus Dibayar: Rp. " + jumlahDiskon);
            System.out.println("========================================");
            System.out.println("Uang yang dibayarkan: Rp. " + bayar);
            System.out.println("Kembalian: " + result * -1);
            inputan.close();
            return;
        }

    }
    
}