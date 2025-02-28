public class MataKuliah {
    /* ATRIBUT */
    private String idMatkul;
    private String nama;
    private int sks;

    /* KONSTRUKTOR */
    /* Konstruktor tanpa parameter */
    public MataKuliah(){
        this.idMatkul = " ";
        this.nama = " ";
        this.sks = 0;
    }

    /* Konstruktor dengan parameter */
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /* SELEKTOR */
    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNama(){
        return this.nama;
    }

    public int getSks(){
        return this.sks;
    }

    /* MUTATOR */
    public void setIdMatkul(String MK){
        this.idMatkul = MK;
    }

    public void setNama(String MK){
        this.nama = MK;
    }

    public void setProdi(int MK){
        this.sks = MK;
    }

    public void printMatkul(){
        System.out.println("ID Mata Kuliah : " + this.idMatkul);
        System.out.println("Nama Mata Kuliah : " + this.nama);
        System.out.println("SKS : " + this.sks);
    }
    
}