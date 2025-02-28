/* Nama File    : MTitik.java
 * Deskripsi    : Berisi main/aplikasi dari class titik
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Tanggal      : 18 - 02 - 2025
*/
public class MTitik {
    public static void main(String[] args) {
        // Membuat objek Titik T1 dan mengubah nilai absis dan ordinatnya
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4); // Menggeser titik T1 sejauh (3,4)
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // Membuat objek Titik baru dengan koordinat (-5,-2)
        Titik T3 = new Titik(-5,-2);
        T3.printTitik();

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T3.getCounterTitik());
        
        // Menampilkan kuadran di mana T1 dan T3 berada
        System.out.println("T1 terletak pada kuadran : " + T1.getKuadran());
        System.out.println("T2 terletak pada kuadran : " + T3.getKuadran());

        // Menampilkan jarak titik T1 dari pusat koordinat dan jarak antara T3 dan T1
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak antara T3 dan T1 = " + T3.getJarak(T1));

        // Membuat objek Titik baru T4 dengan koordinat (2,3)
        Titik T4 = new Titik(2,3);
        T4.printTitik();
        T4.refleksiX();
        T4.refleksiY();
        System.out.println("T4 setelah dilakukan Refleksi thd sb x dan y: ");
        T4.printTitik();

        // Membuat Titik T5 sebagai hasil refleksi T4 terhadap sumbu X dan Y
        System.out.println("Titik T5 merupakan hasil refleksi dari T4 :");
        Titik T5 = T4.getRefleksiX();
        T5.printTitik();
        T5 = T4.getRefleksiY();
        T5.printTitik();
    }
}
