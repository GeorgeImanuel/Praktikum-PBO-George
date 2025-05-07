/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Anjing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class Burung extends Anabul{
    public Burung(String nama){
        super.setNama(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Burung : Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Burung : Cuit");
    }
}
