/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : ContohMetodeGenerik.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

/**
 *
 * @author noels
 */
public class ContohMetodeGenerik {
    public <G extends Anabul> G fungsi (Datum<G> d) {
        return d.getIsi();
    }
}
