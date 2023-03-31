package pert7;
import java.util.Scanner;

public class Chore4 {
    
    public static void main(String[] args) {
        System.out.println("Huruf vokal dan konsonan");
        System.out.println("========================================");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata: ");
        System.out.println("========================================");
        hurufVokal(input.nextLine());
        input.close();
    }

    private static void hurufVokal(String huruf) {
        for (int i = 0; i < huruf.length(); i++) {
            if (huruf.charAt(i) == 'a' || huruf.charAt(i) == 'e' || huruf.charAt(i) == 'i' || huruf.charAt(i) == 'o' || huruf.charAt(i) == 'u' ) {
                System.out.println("huruf " + huruf.charAt(i) + " adalah vokal");
            } else {
                System.out.println("huruf " + huruf.charAt(i) + " adalah konsonan");
            }
        }
    }

}
