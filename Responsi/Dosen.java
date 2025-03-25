/**
 * File         : Dosen.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Dosen extends Karyawan {
    private String fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, String fakultas){
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
    }

    /* Mutator */
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    /* Selektor */
    public String getFakultas(){
        return fakultas;
    }

    @Override
    public double hitungGaji(double gajiPokok){
        return gajiPokok + (getMasaKerja() * 0.01 * gajiPokok);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
