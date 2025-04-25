/**
 * File         : Anabul.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Superclass Anabul
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
