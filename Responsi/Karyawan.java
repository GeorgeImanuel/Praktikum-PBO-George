/**
 * File         : Karyawan.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public abstract class Karyawan extends CivitasAkademika{
    private String NIP;
    private int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja){
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    /* Mutator */
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public abstract double hitungGaji(double gajiPokok);

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja);
    }
}