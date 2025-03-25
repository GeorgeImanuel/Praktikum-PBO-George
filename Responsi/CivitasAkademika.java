/**
 * File         : CivitasAkademika.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class CivitasAkademika {
    private String nama;
    private String email;
    private static int staticCounter;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        staticCounter++;
    }

    /* Mutator */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* Selektor */
    public String getNama() {
        return nama;
    }
       
    public String getEmail() {
        return email;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }

    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
