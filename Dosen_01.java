public class Dosen_01 {
    public String nidn;
    public String nama;
    public int tahunMasuk;
    public String jenjangPendidikan;
    public String prodi;

    public Dosen_01 (String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo(){
        System.out.println("NIDN = " + nidn);
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + tahunMasuk);
        System.out.println("Jenjang Pendidikan = " + jenjangPendidikan);
        System.out.println("Prodi = " + prodi);
    }

    public void ubahProdi(String prodiBaru){
        prodi = prodiBaru;
    }

    public void ubahJPendidikan(String jenjangPendidikanBaru){
        jenjangPendidikan = jenjangPendidikanBaru;
    }
}

