package pert6;

public class Res {

    /**
     * @param harga <code>int</code> : Harga
     * @param diskon <code>int</code> : Diskon
     */
    public static Double hitungDiskon(int harga, int diskon) {
        double a = harga * diskon;
        double hargaFinal = harga - (a / 100);
        return hargaFinal;
    }

}
