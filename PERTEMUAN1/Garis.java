/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class garis
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Tanggal      : 18 - 02 - 2025
*/
public class Garis {
    /* ATRIBUT */
    Titik T0;
    Titik T1;
    static int counterGaris = 0;

    /* KONSTRUKTOR */
    Garis(){
        T0 = new Titik(0,0);
        T1 = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik Awal, Titik Akhir){
        T0 = Awal;
        T1 = Akhir;
        counterGaris++;
    }

    /* SELEKTOR */
    Titik getT0(){
        return T0;
    }

    Titik getT1(){
        return T1;
    }

    /* MUTATOR */
    void setT0(Titik T){
        T0 = T;
    }

    void setT1(Titik T){
        T1 = T;
    }

    /* METHOD */
    // Mengembalikan panjang garis, dihitung dari jarak antara titik T0 dan T1
    double panjangGaris(){
        return T0.getJarak(T1);
    }

    // Mengembalikan gradien garis, dihitung sebagai (y2 - y1) / (x2 - x1)
    double gradienGaris(){
        return ((T1.ordinat - T0.ordinat)/(T1.absis - T0.absis));
    }

    // Mengembalikan titik tengah dari garis sebagai objek Titik baru
    Titik titikTengah(){
        Titik T;

        T = new Titik(((T1.absis-T0.absis)/2)+T0.absis, ((T1.ordinat-T0.ordinat)/2)+T0.ordinat);
        return T;
    }

    // Mengecek apakah garis ini sejajar dengan garis lain G
    boolean isSejajar(Garis G){
        return this.gradienGaris() == G.gradienGaris();
    }

    // Mengecek apakah garis ini tegak lurus dengan garis lain G
    boolean isTegakLurus(Garis G){
        return this.gradienGaris() * G.gradienGaris() == -1;
    }

    // Mencetak koordinat titik awal dan titik akhir garis
    void printGaris(){
        System.out.println("Titik Awal adalah (" + T0.absis + "," + T0.ordinat + ")");
        System.out.println("Titik Akhir adalah (" + T1.absis + "," + T1.ordinat + ")");
    }

    // Mencetak persamaan garis dalam format y = mx + c
    void printFormat()  {
        if((T1.ordinat - gradienGaris()*T1.absis) > 0){
            System.out.println("y = " + gradienGaris() + "x + " + (T1.ordinat - gradienGaris()*T1.absis));
        }
        else{
            System.out.println("y = " + gradienGaris() + "x - " + Math.abs((T1.ordinat - gradienGaris()*T1.absis)));
        }
    }

}
