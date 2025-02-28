/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class garis
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Tanggal      : 18 - 02 - 2025
*/
public class Garis {
    /* ATRIBUT */
    private Titik T0;
    private Titik T1;
    private static int counterGaris = 0;

    /* KONSTRUKTOR */
    public Garis(){
        this.T0 = new Titik(0,0);
        this.T1 = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik Awal, Titik Akhir){
        this.T0 = Awal;
        this.T1 = Akhir;
        counterGaris++;
    }

    /* SELEKTOR */
    public Titik getT0(){
        return this.T0;
    }

    public Titik getT1(){
        return this.T1;
    }

    /* MUTATOR */
    public void setT0(Titik T){
        this.T0 = T;
    }

    public void setT1(Titik T){
        this.T1 = T;
    }

    /* METHOD */
    public static int getCounterGaris(){
        return counterGaris;
    }

    // Mengembalikan panjang garis, dihitung dari jarak antara titik T0 dan T1
    public double panjangGaris(){
        return T0.getJarak(T1);
    }

    // Mengembalikan gradien garis, dihitung sebagai (y2 - y1) / (x2 - x1)
    public double gradienGaris(){
        return ((T1.getOrdinat() - T0.getOrdinat())/(T1.getAbsis() - T0.getAbsis()));
    }

    // Mengembalikan titik tengah dari garis sebagai objek Titik baru
    public Titik titikTengah(){
        Titik T;

        T = new Titik(((T1.getAbsis()-T0.getAbsis())/2)+T0.getAbsis(), ((T1.getOrdinat()-T0.getOrdinat())/2)+T0.getOrdinat());
        return T;
    }

    // Mengecek apakah garis ini sejajar dengan garis lain G
    public boolean isSejajar(Garis G){
        return this.gradienGaris() == G.gradienGaris();
    }

    // Mengecek apakah garis ini tegak lurus dengan garis lain G
    public boolean isTegakLurus(Garis G){
        return this.gradienGaris() * G.gradienGaris() == -1;
    }

    // Mencetak kogetOrdinat() titik awal dan titik akhir garis
    public void printGaris(){
        System.out.println("Titik Awal adalah (" + T0.getAbsis() + "," + T0.getOrdinat() + ")");
        System.out.println("Titik Akhir adalah (" + T1.getAbsis() + "," + T1.getOrdinat() + ")");
    }

    // Mencetak persamaan garis dalam format y = mx + c
    public void printFormat()  {
        if((T1.getOrdinat() - gradienGaris()*T1.getAbsis()) > 0){
            System.out.println("y = " + gradienGaris() + "x + " + (T1.getOrdinat() - gradienGaris()*T1.getAbsis()));
        }
        else{
            System.out.println("y = " + gradienGaris() + "x - " + Math.abs((T1.getOrdinat() - gradienGaris()*T1.getAbsis())));
        }
    }

}
