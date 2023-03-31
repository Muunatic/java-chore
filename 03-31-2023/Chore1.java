package pert7;
import java.util.Scanner;

public class Chore1 {

    public static void main(String[] args) {
        System.out.println("Sisa bagi bilangan bulat");
        System.out.println("========================================");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input bilangan bulat: ");
        int bilangan = input.nextInt();

        System.out.println("========================================");

        if (bilangan %2 == 0) {
            int sisa = bilangan %5;
            System.out.println("Bilangan genap, sisa bagi dengan bagi 5 adalah: " + sisa);
        } else {
            System.out.println("Bilangan ganjil");
        }

        input.close();
    }

}
