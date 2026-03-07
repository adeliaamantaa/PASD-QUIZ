import java.util.Scanner;

public class DosenDemo_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("\tINPUT DATA DOSEN");
        System.out.println("--------------------------");
        System.out.print("Masukkan NIDN: ");
        String nidn = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Tahun Masuk: ");
        int tahunMasuk = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Jenjang Pendidikan: ");
        String pendidikan = sc.nextLine();
        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();

        Dosen_01 dosen = new Dosen_01(nidn, nama, tahunMasuk, pendidikan, prodi);
        
        System.out.println("--------------------------");
        System.out.println("\tTAMPIL DATA");
        System.out.println("--------------------------");
        dosen.tampilkanInfo();
        
        System.out.println("\nUbah Data Dosen");
        System.out.print("Masukkan Prodi Baru: ");
        String prodiBaru = sc.nextLine();
        dosen.ubahProdi(prodiBaru);
        System.out.print("Masukkan Jenjang Pendidikan Baru: ");
        String pendidikanBaru = sc.nextLine();
        dosen.ubahJPendidikan(pendidikanBaru);

        System.out.println("--------------------------");
        System.out.println("\tDATA BARU");
        System.out.println("--------------------------");
        dosen.tampilkanInfo();
    }
}
