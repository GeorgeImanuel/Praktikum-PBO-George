/**
 * File         : Dosen.java
 * Deskripsi    : Program latihan penggunaan Inheritance. Pembuatan Subclass Dosen
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Dosen extends Pegawai {
    protected String Fakultas;

    /* Konstruktor */
    public Dosen(){
        
    }

    public Dosen(String NIP, String Nama, String TglLahir, String TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    /* Selektor */
    public String getFakultas() {
        return Fakultas;
    }

    /* Mutator */
    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    /* Method Lain */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas    : " + Fakultas);
    }
}
