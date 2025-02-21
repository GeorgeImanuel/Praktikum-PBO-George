/* Nama File    : MGaris.java
 * Deskripsi    : Berisi main/aplikasi dari class garis
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Tanggal      : 18 - 02 - 2025
*/
public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik dengan koordinat tertentu
        Titik T0 = new Titik(3,4);
        Titik T1 = new Titik(6,10);
        Titik T3 = new Titik(4,6);
        Titik T4 = new Titik(-1,8);

        // Membuat objek Garis dengan berbagai cara
        Garis G1 = new Garis();
        Garis G2 = new Garis(T0,T1);
        Garis G3 = new Garis(T1,T3);
        Garis G4 = new Garis(T0,T4);

        // Menampilkan panjang garis G1 dan G2
        System.out.println("Panjang garis G1 = " + G1.panjangGaris());
        System.out.println("Panjang garis G2 = " + G2.panjangGaris());

        // Menampilkan gradien dari garis G1 dan G2
        System.out.println("Gradien garis G1 = " + G1.gradienGaris());
        System.out.println("Gradien garis G2 = " + G2.gradienGaris());

        // Mendapatkan titik tengah dari garis G2
        Titik T2 = G2.titikTengah();
        System.out.println("Titik T2 adalah titik tengah garis G2 : ");
        T2.printTitik();

        // Mengecek apakah dua garis sejajar
        System.out.println("Apakah G1 dan G2 sejajar :"  + G1.isSejajar(G2));
        System.out.println("Apakah G2 dan G3 sejajar :"  + G2.isSejajar(G3));

        // Mengecek apakah dua garis tegak lurus
        System.out.println("Apakah G1 dan G2 sejajar :"  + G1.isTegakLurus(G2));
        System.out.println("Apakah G1 dan G4 sejajar :"  + G1.isTegakLurus(G4));

        // Menampilkan informasi tentang garis G2
        System.out.println("Garis G2:");
        G2.printGaris();

        // Menampilkan persamaan garis G2 dan G4 dalam format y = mx + c
        System.out.println("Menampilkan persamaan G2 dalam bentuk string:");
        G2.printFormat();
        System.out.println("Menampilkan persamaan G4 dalam bentuk string:");
        G4.printFormat();
    }
}
