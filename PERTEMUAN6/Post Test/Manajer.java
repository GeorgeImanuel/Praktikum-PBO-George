/**
 * File         : Manajer.java
 * Deskripsi    : Subclass Manajer
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println();
        System.out.println("Tunjangan : " + tunjangan);
    }

}
