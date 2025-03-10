/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */
public class AngkaSial{
    public void cobaAngka (int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+ " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //method getMessage () telah ada pada kelas "Exception"
            System.out.println (ase.getMessage ());
            System.out.println ("hati-hati memasukkan angka! ! !") ;
        }
    }
}

// PERTANYAAN: 
// *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Tidak, Baris 12 hanya akan dieksekusi jika angka bukan 13. Ketika angka 13 dimasukkan, program akan langsung melempar AngkaSialException, sehingga baris 12 dilewati.  


// *Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  
// Tidak, Dalam main(), metode cobaAngka() dipanggil dalam blok try-catch:
// - Saat as.cobaAngka(10) dipanggil, tidak ada error, sehingga program melanjutkan ke baris berikutnya. 
// - Saat as.cobaAngka(13) dipanggil, exception dilempar. 
// - Begitu exception dilempar, program langsung melompat ke blok catch. Akibatnya, baris 21 tidak dieksekusi karena sudah keluar dari blok try