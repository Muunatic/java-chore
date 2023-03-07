package pert5;

public class Res {
    
    /**
     * @param harga <code>int</code> : Harga
     * @param diskon <code>int</code> : Diskon
     */
    public static Double hitungDiskon(int harga, int diskon) {
        double params = harga * diskon;
        double hargaFinal = harga - (params / 100);
        return hargaFinal;
    }
    
}
