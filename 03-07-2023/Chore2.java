package pert5;
import javax.swing.JOptionPane;

public class Chore2 {

    public static void main(String[] args) {
        System.out.println("Hitung Diskon");
        System.out.println("====================");
        int inputHarga = Integer.parseInt(JOptionPane.showInputDialog("Input Harga: "));
        int inputDiskon = Integer.parseInt(JOptionPane.showInputDialog("Input Diskon (%): "));
        double hargaAkhir = Res.hitungDiskon(inputHarga, inputDiskon);
        System.out.println("Harga yang harus dibayar: " + hargaAkhir);
    }

}
