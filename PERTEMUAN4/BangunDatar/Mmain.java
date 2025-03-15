/**
 * File         : Mmain.java
 * Deskripsi    : Main program penggunaan Inheritance.
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Mmain {
    public static void main(String[] args) {
        System.out.println("========== Membuat Objek Persegi ==========");
        System.out.println("Persegi P1:");

        Persegi P1 = new Persegi(8, "Merah", "Putih" );
        P1.setBorder("Biru");
        P1.printInfo();
        System.out.println("Diagonal: " + P1.getDiagonal());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Luas: " + P1.getLuas());

        System.out.println("========== Membuat Objek Lingkaran ==========");
        System.out.println("Lingkaran L1:");

        Lingkaran L1 = new Lingkaran(7, "Merah", "Putih" );
        L1.setBorder("Biru");
        L1.printInfo();
        System.out.println("Keliling: " + L1.getKeliling());
        System.out.println("Luas: " + L1.getLuas());

    }
}