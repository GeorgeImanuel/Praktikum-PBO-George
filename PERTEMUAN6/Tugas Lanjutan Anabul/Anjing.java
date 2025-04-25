/**
 * File         : Anjing.java
 * Deskripsi    : Program Tugas lanjutan Polimorfisme. Pembuatan Subclass Anjing
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

 public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
}
