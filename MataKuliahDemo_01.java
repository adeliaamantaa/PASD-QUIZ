public class MataKuliahDemo_01 {

    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("\tTAMPIL DATA");
        System.out.println("----------------------------");
        Dosen_01 ds1 = new Dosen_01("1234567890","Pak Dosen",2010,"S2","TI");
        Dosen_01 ds2 = new Dosen_01("0987654321","Bu Dosen",2012,"S3","TI");

        MataKuliah_01 mk1 = new MataKuliah_01("1234567890","Algoritma dan Struktur Data",3,3);

        mk1.tambahDosen(ds1);
        mk1.tambahDosen(ds2);

        mk1.tampilkanInfo();

        mk1.ubahNamaMK("Struktur Data");
        mk1.ubahSKS(4);

        System.out.println("\t DATA BARU");
        System.out.println("----------------------------");
        mk1.tampilkanInfo();
    }
}
