import java.util.Scanner;

public class SimulasiPassingGradeSiswa {
    public static void main(String[] args){
        int mathValue, bahasaValue, englishValue, sainsValue;
        double averageTotal, bahasaAverageValue;
        boolean smkPadepokan79, jurusanSastra, jurusanTKJ;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai Ujian Matematika :");
        mathValue = input.nextInt();
        
        System.out.println("Masukan nilai Ujian Bhs.Indonesia :");
        bahasaValue = input.nextInt();
        
        System.out.println("Masukan nilai Ujian Bhs.Inggris :");
        englishValue = input.nextInt();
        
        System.out.println("Masukan nilai Ujian IPA :");
        sainsValue = input.nextInt();


        System.out.println("Hasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut :");
        System.out.println("===================================================================");
        
        averageTotal = (mathValue + bahasaValue + englishValue + sainsValue) / 4;
        bahasaAverageValue = (bahasaValue + englishValue) / 2;
        
        smkPadepokan79 = (73 <= averageTotal);
        jurusanSastra = (75 <= bahasaAverageValue);
        jurusanTKJ = (80 < mathValue);
        
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke SMK Padepokan 79 : " + smkPadepokan79);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Sastra : " + jurusanSastra);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer Jaringan : " + jurusanTKJ);
    
    } 
}
