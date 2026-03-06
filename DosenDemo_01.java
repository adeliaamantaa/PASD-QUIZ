public class DosenDemo_01 {
    public static void main(String[] args) {
        Dosen_01 dosen = new Dosen_01("1234567890", "Dosen1", 2010, "S1","Teknik Informatika");
        
        System.out.println("--------------------------");
        System.out.println("\tTAMPIL DATA");
        System.out.println("--------------------------");
        dosen.tampilkanInfo();
        dosen.ubahProdi("Sistem Informasi Bisnis");
        dosen.ubahJPendidikan("S2");

        System.out.println("--------------------------");
        System.out.println("\tDATA BARU");
        System.out.println("--------------------------");
        dosen.tampilkanInfo();
    }
}
