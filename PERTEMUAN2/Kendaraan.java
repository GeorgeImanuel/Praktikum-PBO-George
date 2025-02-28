public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* Konstruktor */
    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = " ";
        this.jenis = " ";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* SELEKTOR */
    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    /* MUTATOR */
    public void setNoPlat(String K){
        this.noPlat = K;
    }

    public void setJenis(String K){
        this.jenis = K;
    }

    public void printKendaraan(){
        System.out.println("Nomor Plat : " + this.noPlat);
        System.out.println("Jenis Kendaraan : " + this.jenis);
    }    
}