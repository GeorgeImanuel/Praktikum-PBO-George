/**
 * File         : Persegi.java
 * Deskripsi    : Program penggunaan Inheritance. Pembuatan Subclass Persegi
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

// Kelas Persegi yang merupakan turunan dari BangunDatar
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
        printCounterBangunDatar();
    }

    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
        printCounterBangunDatar();
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printCounterBangunDatar(){
    //     super.printCounterBangunDatar();
    //     System.out.println(" adalah jumlah counter Bangun Datar");
    // }
}