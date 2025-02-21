/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class titik
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Tanggal      : 18 - 02 - 2025
*/

public class Titik {
    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* METHOD */
    /*Konstruktor untuk membuat titik (0,0)*/
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


    /* FUNGSI/PROSEDUR */
    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // Menentukan kuadran tempat titik berada
    int getKuadran (){
        if(absis > 0 && ordinat > 0){
            return 1;
        }
        else if(absis < 0 && ordinat > 0){
            return 2;
        }
        else if(absis < 0 && ordinat < 0){
            return 3;
        }
        else if(absis > 0 && ordinat < 0){
            return 4;
        }
        else{
            return 0;
        }
    }

    // Mengembalikan jarak titik dari pusat koordinat (0,0)
    double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    // Mengembalikan jarak antara titik ini dengan titik lain T
    double getJarak(Titik T){
        double x = T.absis - this.absis;
        double y = T.ordinat - this.ordinat;
        return Math.sqrt((x*x) + (y*y));
    }

    // Melakukan refleksi titik terhadap sumbu X
    void refleksiX(){
        ordinat = ordinat * (-1);
    }

    // Melakukan refleksi titik terhadap sumbu Y
    void refleksiY(){
        absis = absis * (-1);
    }

    // Mengembalikan objek Titik baru yang merupakan refleksi terhadap sumbu X
    Titik getRefleksiX(){
        Titik T;
        T = new Titik();

        T.absis = this.absis;
        T.ordinat = this.ordinat * (-1);

        return T;
    }

    // Mengembalikan objek Titik baru yang merupakan refleksi terhadap sumbu Y
    Titik getRefleksiY(){
        Titik T;
        T = new Titik();
        
        T.absis = this.absis * (-1);
        T.ordinat = this.ordinat;

        return T;
    }

} //end class Titik