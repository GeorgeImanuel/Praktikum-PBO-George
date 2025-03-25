/**
 * File         : Main.java
 * Deskripsi    : Main RESPONSI
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Main {
    public static void main(String[] args) {
        // Membuat Fakultas
        Fakultas FKM = new Fakultas("Fakultas Kesehatan Masyarakan", 9500000, 7000000);
        Fakultas FSM = new Fakultas("Fakultas Sains Matematika", 8500000, 5000000);

        Fakultas[] daftarFakultas = {FKM, FSM};

        // Membuat Dosen
        Dosen dosen1 = new Dosen("Prof. Heru", "heru@lecturer.com", "12345", 10, "Fakultas Kesehatan Masyarakat");
        Dosen dosen2 = new Dosen("Dr. Bambang", "bams@lecturer.com", "67890", 15, "Fakultas Kesehatan Masyarakat");

        // Membuat Tendik
        Tendik tendik1 = new Tendik("Eko", "eko@gmail.com", "11111", 15);
        Tendik tendik2 = new Tendik("Bu Sri", "sri@gmail.com", "22222", 8);

        Karyawan[] daftarKaryawan = {dosen1, dosen2, tendik1, tendik2};

        // Membuat Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Fey", "fey@students.com", "123456789", "Fakultas Kesehatan Masyarakat", 4, "UNDIP");
        Mahasiswa mahasiswa2 = new Mahasiswa("George", "george@student.com", "987654321", "Fakultas Sains Matematika", 4, "ITB");

        // Membuat Universitas
        Universitas undip = new Universitas("Universitas Diponegoro", daftarFakultas, daftarKaryawan);

        // Menampilkan informasi Universitas
        System.out.println("===== INFORMASI UNIVERSITAS =====");
        System.out.println("Nama Universitas: " + undip.getNama());

        // Menampilkan informasi Fakultas
        System.out.println("\n===== INFORMASI FAKULTAS =====");
        for (Fakultas fak : daftarFakultas) {
            System.out.println("Nama Fakultas: " + fak.getNama());
            System.out.println("Tarif UKT: Rp" + fak.getTarifUKT());
            System.out.println("Gaji Pokok Dosen: Rp" + fak.getGajiPokok());
            System.out.println("--------------------------------");
        }

        // Menampilkan informasi Karyawan
        System.out.println("\n===== INFORMASI KARYAWAN =====");
        for (Karyawan k : daftarKaryawan) {
            k.printInfo();
            System.out.println("Gaji: Rp" + k.hitungGaji(7000000)); // Contoh dengan gaji pokok 7 juta
            System.out.println("--------------------------------");
        }

        // Menampilkan informasi Mahasiswa
        System.out.println("\n===== INFORMASI MAHASISWA =====");
        mahasiswa1.printInfo();
        System.out.println("UKT yang harus dibayar: Rp" + mahasiswa1.hitungUKT(FKM.getTarifUKT()));

        System.out.println();
        mahasiswa2.printInfo();
        System.out.println("UKT yang harus dibayar: Rp" + mahasiswa2.hitungUKT(FSM.getTarifUKT()));
    }
}
