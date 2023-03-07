package pert5;
import javax.swing.JOptionPane;

public class Chore1 {

    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Input Nama: ");
        String nim = JOptionPane.showInputDialog("Input NIM: ");
        System.out.println("Data Mahasiswa");
        System.out.println("====================");
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama Lengkap            : " + nama);
        System.out.println("Tahun Angkatan          : " + hitungAngkatan(nim));
        System.out.println("Nilai AKhir             : " + hitungNilai(89, 78, 86, 90));
    }

    /**
     * @param a <code>int</code> Nilai tugas
     * @param b <code>int</code> Nilai absen
     * @param c <code>int</code> Nilai UTS
     * @param d <code>int</code> Nilai UAS
     */
    private static Double hitungNilai(int a, int b, int c, int d) {
        Double a1, b1, c1, d1;
        Double e;
        a1 = 0.20 * a;
        b1 = 0.20 * b;
        c1 = 0.30 * c;
        d1 = 0.30 * d;
        e = (a1 + b1 + c1 + d1);
        return e;
    }

    /**
     * @param tahun : Parameter tahun
     */
    private static String hitungAngkatan(String tahun) {
        tahun = tahun.substring(0, 2);
        return "20" + tahun;
    }
    
}
