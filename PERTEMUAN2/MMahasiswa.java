public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("D001", "Cahyo","Informatika");
        Dosen dosen2 = new Dosen("D002","Bambang","Informatika");
        
        MataKuliah matkul1 = new MataKuliah("MK001","PBO",3);
        MataKuliah matkul2 = new MataKuliah("MK002","MBD",3);
        MataKuliah matkul3 = new MataKuliah("MK003","Matematika II",2);

        Kendaraan kendaraan1 = new Kendaraan("H4194IS","Mobil");
        Kendaraan kendaraan2 = new Kendaraan("H0124NG","Motor");

        Mahasiswa mhs1 = new Mahasiswa("240123","Arel","Informatika");
        Mahasiswa mhs2 = new Mahasiswa("240456","Bintang","Informatika");

        mhs1.setDosenWali(dosen1);
        mhs2.setDosenWali(dosen2);

        mhs1.setKendaraan(kendaraan1);
        mhs2.setKendaraan(kendaraan2);

        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);
        mhs1.addMatKul(matkul3);

        mhs2.addMatKul(matkul1);
        mhs2.addMatKul(matkul2);

        mhs1.printDetailMhs();
        mhs1.printMhs();
        System.out.println("Jumlah Matkul : " + mhs1.getJumlahMatKul());
        System.out.println("Jumlah SKS Matkul: " + mhs1.getJumlahSKS());

        System.out.println("\n");
        
        mhs2.printDetailMhs();
        mhs2.printMhs();
        System.out.println("Jumlah Matkul : " + mhs2.getJumlahMatKul());
        System.out.println("Jumlah SKS Matkul: " + mhs2.getJumlahSKS());
    }
}