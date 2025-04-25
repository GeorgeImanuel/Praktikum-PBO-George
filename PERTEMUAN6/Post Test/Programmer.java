/**
 * File         : Programmer.java
 * Deskripsi    : Subclass Programmer
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println();
        System.out.println("Bonus : " + bonus);
    }
}
