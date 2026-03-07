import java.util.Scanner;

public class MataKuliahDemo_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("\tINPUT DATA DOSEN");
        System.out.println("----------------------------");
        System.out.print("NIDN Dosen 1: ");
        String nidn1 = sc.nextLine();
        System.out.print("Nama Dosen 1: ");
        String nama1 = sc.nextLine();
        System.out.print("Tahun Masuk: ");
        int tahun1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Jenjang Pendidikan: ");
        String jp1 = sc.nextLine();
        System.out.print("Prodi: ");
        String prodi1 = sc.nextLine();

        Dosen_01 ds1 = new Dosen_01(nidn1,nama1,tahun1,jp1,prodi1);

        System.out.println();
        System.out.print("NIDN Dosen 2: ");
        String nidn2 = sc.nextLine();
        System.out.print("Nama Dosen 2: ");
        String nama2 = sc.nextLine();
        System.out.print("Tahun Masuk: ");
        int tahun2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Jenjang Pendidikan: ");
        String jp2 = sc.nextLine();
        System.out.print("Prodi: ");
        String prodi2 = sc.nextLine();

        Dosen_01 ds2 = new Dosen_01(nidn2,nama2,tahun2,jp2,prodi2);

        System.out.println("----------------------------");
        System.out.println("\tINPUT DATA MATAKULIAH");
        System.out.println("----------------------------");
        System.out.print("Kode MK: ");
        String kode = sc.nextLine();
        System.out.print("Nama MK: ");
        String namaMK = sc.nextLine();
        System.out.print("SKS: ");
        int sks = sc.nextInt();

        MataKuliah_01 mk1 = new MataKuliah_01(kode,namaMK,sks,3);

        mk1.tambahDosen(ds1);
        mk1.tambahDosen(ds2);

        System.out.println("----------------------------");
        System.out.println("\tTAMPIL DATA");
        System.out.println("----------------------------");
        mk1.tampilkanInfo();
        
        sc.nextLine();
        
        System.out.print("Ubah Nama MK: ");
        String namaBaru = sc.nextLine();
        mk1.ubahNamaMK(namaBaru);
        System.out.print("Ubah SKS: ");
        int sksBaru = sc.nextInt();
        mk1.ubahSKS(sksBaru);

        System.out.println("\tDATA BARU");
        System.out.println("----------------------------");
        mk1.tampilkanInfo();
    }
}
