/**
 * File         : Fakultas.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    
}
