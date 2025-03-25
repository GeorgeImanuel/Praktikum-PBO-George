/**
 * File         : Mahasiswa.java
 * Deskripsi    : RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Mahasiswa extends CivitasAkademika{
    private String NIM;
    private String fakultas;
    private int Semester;
    private String Universitas;

    public Mahasiswa(String nama, String email, String NIM, String fakultas, int Semester, String Universitas){
        super(nama, email);
        this.NIM = NIM;
        this.fakultas = fakultas;
        this.Semester = Semester;
        this.Universitas = Universitas;
    }

    /* Mutator */
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /* Selektor */
    public String getNIM() {
        return NIM;
    }
    
    public int getSemester() {
        return Semester;
    }
    
    public String getFakultas() {
        return fakultas;
    }

    public String getUniversitas() {
        return Universitas;
    }

    /* Method lain */
    public double hitungUKT(double tarifUKT) {
        return tarifUKT * Math.pow(0.95, Semester - 1);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM: " + NIM);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Semester: " + Semester);
        System.out.println("Universitas: " + Universitas);
    }
}
