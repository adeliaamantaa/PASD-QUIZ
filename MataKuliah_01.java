public class MataKuliah_01 {

    String kodeMK;
    String namaMK;
    int sks;
    Dosen_01[] arrayOfDosen;
    int jumlahDosen = 0;

    public MataKuliah_01(String kodeMK, String namaMK, int sks, int jumlahDosenMax){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        arrayOfDosen = new Dosen_01[jumlahDosenMax];
    }

    public void tampilkanInfo(){
        System.out.println("Kode MK = " + kodeMK);
        System.out.println("Nama MK = " + namaMK);
        System.out.println("SKS = " + sks);

        System.out.println("Dosen Pengampu =");
        for(int i=0;i<jumlahDosen;i++){
            System.out.println((i+1) + ". " + arrayOfDosen[i].nama);
        }

        System.out.println("----------------------------");
    }

    public void ubahNamaMK(String namaMKBaru){
        namaMK = namaMKBaru;
    }

    public void ubahSKS(int sksBaru){
        if(sksBaru >= 2){
            sks = sksBaru;
        }else{
            System.out.println("SKS tidak boleh kurang dari 2");
        }
    }

    public void tambahDosen(Dosen_01 dosen){
        if(jumlahDosen < arrayOfDosen.length){
            arrayOfDosen[jumlahDosen] = dosen;
            jumlahDosen++;
        }else{
            System.out.println("Dosen sudah penuh");
        }
    }
}
