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

        int pilihan;

        do {
            System.out.println("\n===== MENU UBAH DATA =====");
            System.out.println("1. Ubah Prodi");
            System.out.println("2. Ubah Jenjang Pendidikan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Prodi Baru: ");
                    String prodiBaru = sc.nextLine();
                    dosen.ubahProdi(prodiBaru);
                    System.out.println("Prodi berhasil diubah!");
                    break;
                case 2:
                    System.out.print("Masukkan Jenjang Pendidikan Baru: ");
                    String pendidikanBaru = sc.nextLine();
                    dosen.ubahJPendidikan(pendidikanBaru);
                    System.out.println("Jenjang pendidikan berhasil diubah!");
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 3);

        System.out.println("--------------------------");
        System.out.println("\tDATA BARU");
        System.out.println("--------------------------");
        dosen.tampilkanInfo();
    }
}
