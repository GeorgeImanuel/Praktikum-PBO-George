/**
 * File         : Main.java
 * Deskripsi    : Program latihan penggunaan Inheritance. Pembuatan Main
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Main {
        public static void main(String[] args) {
                // Data Dosen Tetap
                DosenTetap dosenTetap = new DosenTetap(
                        "9545647548", "Prof. Amin", "5 May 1990", "1 January 2015",
                        5000000, "Fakultas Sains dan Matematika", "78647324"
                );

                // Data Dosen Tamu
                DosenTamu dosenTamu = new DosenTamu(
                        "1234567890", "Dr. Joko", "10 July 1985", "1 February 2022",
                        4000000, "Fakultas Teknik", "56789432", 6 // Masa kontrak: 6 bulan
                );

                // Data Tendik
                Tendik tendik = new Tendik(
                        "9876543210", "Citra", "20 August 1992", "6 March 2018",
                        4500000, "Administrasi Akademik"
                );

                // Menampilkan data pegawai
                System.out.println("\n===== DATA DOSEN TETAP =====");
                dosenTetap.printInfo();

                System.out.println("\n===== DATA DOSEN TAMU =====");
                dosenTamu.printInfo();

                System.out.println("\n===== DATA TENAGA KEPENDIDIKAN (TENDIK) =====");
                tendik.printInfo();
        }
}






