package pert7;
import java.util.Scanner;

public class Chore2 {

    public static void main(String[] args) {
        System.out.println("3 Angka mana yang terbesar");
        System.out.println("========================================");
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.print("Masukan bilangan pertama: ");
        x = input.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        y = input.nextInt();
        System.out.print("Masukan bilangan ketiga: ");
        z = input.nextInt();

        System.out.println("========================================");

        if (x > y && x > z) {
            System.out.println("Bilangan terbesar adalah: " + x);
        } else if (y > x && y > z) {
            System.out.println("Bilangan terbesar adalah: " + y);
        } else {
            System.out.println("Bilangan terbesar adalah: " + z);
        }
        
        input.close();
    }
    
}
