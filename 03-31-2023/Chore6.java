package pert7;
import java.util.Scanner;

public class Chore6 {
    
    public static void main(String[] args) {
        System.out.println("Konversi detik");
        System.out.println("========================================");
        int jam, menit, detik;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input detik: ");
        int x = input.nextInt();
        
        jam     = x / 3600;
        menit   = (x % 3600) / 60;
        detik   = (x % 3600) % 60;
        
        System.out.println("Konversi: " + jam + " jam, " + menit + " menit, " + detik + " detik");

        input.close();
    }
    
}