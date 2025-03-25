/**
 * File         : Tendik.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Tendik extends Karyawan {
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
    }

    @Override
    public double hitungGaji(double gajiPokok) {
        return 4000000 + (getMasaKerja() * 0.01 * 4000000);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}