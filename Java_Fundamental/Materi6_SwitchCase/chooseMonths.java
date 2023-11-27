import java.util.Scanner;

public class chooseMonths{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String result;
        int month;

        System.out.print("Pilih Bulan (Angka 1 - 12) : ");
        month = input.nextInt();

        switch (month) {
            case 1: result = "Januari";
                break;
            case 2: result = "Februari";
                break;
            case 3: result = "Maret";
                break;                
            case 4: result = "April";
                break;
            case 5: result = "Mei";
                break;
            case 6: result = "Juni";
                break;
            case 7: result = "Juli";
                break;                
            case 8: result = "Agustus";
                break;
            case 9: result = "September";
                break;
            case 10: result = "Oktober";
                break;
            case 11: result = "November";
                break;                
            case 12: result = "Desember";
                break;        
            default: result = "invalid input range input 1 to 12";
                break;
        }

        System.out.println(result);
        }
}