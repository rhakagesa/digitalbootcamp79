import java.util.Scanner;

public class JobVacation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name, gender, education;  
        int experience, age;
        double looks;
        boolean coordinator, coordinatorCriteria1, coordinatorCriteria2, admin, adminCriteria1, adminCriteria2;
        
        System.out.println("========= Input =========");
        System.out.print("Nama : ");
        name = input.next();
        System.out.print("Umur : ");
        age = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
        gender = input.next();
        System.out.print("Lulusan (SMK/D3/S1) : ");
        education = input.next();
        System.out.print("Pengalaman (Tahun) : ");
        experience = input.nextInt();
        System.out.print("Penampilan (1/10) : ");
        looks = input.nextDouble();

        System.out.println("========= Output =========");
        System.out.println(name + ", terima kasih sudah mengikuti lowongan kerja di PT. Padepokan Tujuh Sembilan");
        System.out.println();

        coordinatorCriteria1 = ( gender.equalsIgnoreCase("Pria") && (age >= 21 && age <= 30) && (education.equalsIgnoreCase("SMK")||education.equalsIgnoreCase("D3")) && experience >= 2);
        coordinatorCriteria2 = ( gender.equalsIgnoreCase("Pria") && age > 30 && education.equalsIgnoreCase("S1") && experience >= 5);
        coordinator = coordinatorCriteria1 || coordinatorCriteria2;
        
        adminCriteria1 = ( gender.equalsIgnoreCase("Wanita") && (age >= 20 && age <= 25) && education.equalsIgnoreCase("D3") && (looks > 8.5 || experience >= 1));
        adminCriteria2 = ( gender.equalsIgnoreCase("Wanita") && age > 25 && education.equalsIgnoreCase("S1") && looks > 8.5 && experience >= 5);
        admin = adminCriteria1 || adminCriteria2;


        System.out.println("Berikut Hasil dari Rekrutmen : ");
        System.out.println("Hasil Kelulusan untuk Koordinator : "+ coordinator);
        System.out.println("Hasil Kelulusan untuk Admin : "+ admin);
    }
}
