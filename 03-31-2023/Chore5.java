package pert7;

public class Chore5 {
    
    private String nama;
    private int nim;
    private String asalsekolah;

    public Chore5(String namaMahasiswa, int nimMahasiswa, String asalMahasiswa) {
        this.nama = namaMahasiswa;
        this.nim = nimMahasiswa;
        this.asalsekolah = asalMahasiswa;
    }

    public String getNama() {
        return this.nama;
    }

    public int getNim() {
        return this.nim;
    }

    public String getAsal() {
        return this.asalsekolah;
    }
   
    public static void main(String[] args) {
        System.out.println("Class, Method, Constructor");
        System.out.println("========================================");
        Chore5 MahasiswaProfile = new Chore5("Lorem Ipsum", 1000010, "Lorem Ipsum");
       
        System.out.println("Nama: " + MahasiswaProfile.getNama() + ", NIM: " + MahasiswaProfile.getNim() + ", Asal: " + MahasiswaProfile.getAsal());
    }

}
