import java.util.Scanner;

public class jobVacancyV3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name, gender, education, result = "", position;  
        int experience, age;
        double looks;
        
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
        System.out.print("Posisi yang dilamar (SPV, Admin, Coordinator) : ");
        position = input.next();

        if(position.equalsIgnoreCase("coordinator")){
            result = coordinator(name, age, gender, education, experience, looks, position);
        } else if(position.equalsIgnoreCase("admin")){
            result = admin(name, age, gender, education, experience, looks, position);
        } else if(position.equalsIgnoreCase("spv")){
            result = spv(name, age, gender, education, experience, looks, position);
        }

        System.out.println();
        System.out.println("========= Output =========");
        System.out.print("");
        System.out.println(name + ", terima kasih sudah mengikuti lowongan kerja di PT. Padepokan Tujuh Sembilan");
        System.out.print("");
        System.out.println("Berikut Hasil dari Rekrutmen : ");
        System.out.println(result + ".");
    }

    public static String coordinator(String name, int age, String gender, String education, int experience, double looks, String position) {
        boolean coordinator, coordinatorCriteria1, coordinatorCriteria2;
        String result;
        
        coordinatorCriteria1 = ( gender.equalsIgnoreCase("Pria") && (age >= 21 && age <= 30) && (education.equalsIgnoreCase("SMK")||education.equalsIgnoreCase("D3")) && experience >= 2);
        coordinatorCriteria2 = ( gender.equalsIgnoreCase("Pria") && age > 30 && education.equalsIgnoreCase("S1") && experience >= 5);
        coordinator = coordinatorCriteria1 || coordinatorCriteria2;

        if(coordinator){
            result = "Selamat "+ name + " Anda memenuhi syarat untuk sebagai " + position + ". Dan akan masuk ke Tahap selanjutnya ";
            return result;
        } else {
            result = "Maaf "+ name + " Anda tidak memenuhi syarat untuk sebagai " + position + ". Dan tidak akan masuk ke Tahap selanjutnya ";
            return result;
        }
    }

    public static String admin(String name, int age, String gender, String education, int experience, double looks, String position) {
        boolean admin, adminCriteria1, adminCriteria2, adminCriteria3;
        String result;
        
        adminCriteria1 = ( gender.equalsIgnoreCase("Wanita") && (age >= 20 && age <= 25) && education.equalsIgnoreCase("D3") && (looks > 8.5 || experience >= 1));
        adminCriteria2 = ( gender.equalsIgnoreCase("Wanita") && age > 25 && education.equalsIgnoreCase("S1") && looks > 8.5 && experience >= 3);
        adminCriteria3 = ( gender.equalsIgnoreCase("Pria") && (age >= 20 && age <= 30) && looks > 8.5 && (education.equalsIgnoreCase("D3")||education.equalsIgnoreCase("S1")) && experience >= 2);
        admin = adminCriteria1 || adminCriteria2 || adminCriteria3;

        if(admin){
            result = "Selamat "+ name + " Anda memenuhi syarat untuk sebagai " + position + ". Dan akan masuk ke Tahap selanjutnya ";
            return result;
        } else {
            result = "Maaf "+ name + " Anda tidak memenuhi syarat untuk sebagai " + position + ". Dan tidak akan masuk ke Tahap selanjutnya ";
            return result;
        }
    }

    public static String spv(String name, int age, String gender, String education, int experience, double looks, String position) {
        boolean spv, spvCriteria1, spvCriteria2;
        String result;

        spvCriteria1 = ( (gender.equalsIgnoreCase("Pria") || gender.equalsIgnoreCase("Wanita")) && (age >= 23 && age <= 30) && education.equalsIgnoreCase("S1") && experience > 1 );
        spvCriteria2 = ( (gender.equalsIgnoreCase("Pria") || gender.equalsIgnoreCase("Wanita")) && (age >= 25 && age <= 35) && education.equalsIgnoreCase("D3") && experience > 4);
        spv = spvCriteria1 || spvCriteria2;

        if(spv){
            result = "Selamat "+ name + " Anda memenuhi syarat untuk sebagai " + position + ". Dan akan masuk ke Tahap selanjutnya ";
            return result;
        } else {
            result = "Maaf "+ name + " Anda tidak memenuhi syarat untuk sebagai " + position + ". Dan tidak akan masuk ke Tahap selanjutnya ";
            return result;
        }
    }   
}
