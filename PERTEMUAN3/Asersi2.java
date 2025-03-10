/**
 * FIle         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */
 //class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

// PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 

// Asersi digunakan untuk memeriksa kondisi jariJari > 0, namun nilainya telah dideklarasikan sebagai 0 sebelum asersi dilakukan. Karena jariJari = 0, maka asersi akan selalu gagal dan program akan berhenti dengan AssertionError.
