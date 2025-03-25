/**
 * File         : Universitas.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Universitas{
    private String nama;
    private Fakultas[] fakultas;
    private Karyawan[] karyawan;

    public Universitas(String nama, Fakultas[] fakultas, Karyawan[] karyawan) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.karyawan = karyawan;
    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setFakultas(Fakultas[] fakultas) {
        this.fakultas = fakultas;
    }

    public void setKaryawan(Karyawan[] karyawan) {
        this.karyawan = karyawan;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }

    public Fakultas[] getFakultas() {
        return fakultas;
    }

    public Karyawan[] getKaryawan() {
        return karyawan;
    }

}