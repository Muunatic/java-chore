package pert7;
import java.util.Scanner;

public class Chore3 {

    public static void main(String[] args) {
        System.out.println("Susun kata");
        System.out.println("========================================");
        String kata1;
        String kata2;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata pertama: ");
        kata1 = input.nextLine();
        System.out.print("Masukan kata kedua: ");
        kata2 = input.nextLine();

        System.out.println("========================================");

        if (kata1.compareTo(kata2) < 0) {
            System.out.println(kata1 + ", " + kata2);
        } else if (kata1.compareTo(kata2) > 0) {
            System.out.println(kata2 + ", " + kata1);
        } else {
            System.out.println(kata1 + ", " + kata2);
        }

        input.close();
    }
    
}
