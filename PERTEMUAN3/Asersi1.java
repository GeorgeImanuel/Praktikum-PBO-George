/**
 * FIle         : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan asersi
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

 public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan code";
            System.out.println("x bilangan negatif");
        }
    }
}