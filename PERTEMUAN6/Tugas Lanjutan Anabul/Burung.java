/**
 * File         : Burung.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Subclass Burung
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: cuit!");
    }
}
