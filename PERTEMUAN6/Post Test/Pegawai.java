/**
 * File         : Pegawai.java
 * Deskripsi    : Superclass Pegawai
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.print("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }

}
