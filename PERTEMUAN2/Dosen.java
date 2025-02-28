public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    /* KONSTRUKTOR */
    /* Konstruktor tanpa parameter*/
        public Dosen() {
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
    }

    /* Konstruktor dengan parameter */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* SELEKTOR */
    public String getNip(){
        return this.nip;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    /* MUTATOR */
    public void setNip(String D){
        this.nip = D;
    }

    public void setNama(String D){
        this.nama = D;
    }

    public void setProdi(String D){
        this.prodi = D;
    }

    public void printDosen(){
        System.out.println("NIP : " + this.nip);
        System.out.println("Nama : " + this.nama);
        System.out.println("Program Studi : " + this.prodi);
    }
    
}