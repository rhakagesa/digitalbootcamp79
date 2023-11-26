import java.util.Scanner;
import java.util.ArrayList;

public class ArrayCase1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int number[] = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        
        int userInput; 

        System.out.println("Mencari Angka yang ada di Arrays numbers.");
        System.out.println("List Angka :");
        for (int num : number) {
            System.out.print(num + " ");            
        }
        System.out.println("Total panjang Array " + number.length);

        System.out.println();
        System.out.print("Masukan angka yang anda cari : ");
        userInput = input.nextInt();

        for (int i = 0; i < number.length; i++) {
            if(userInput == number[i]){
                result.add(i);
            }
        }
        
        if(result.size() != 0){
            System.out.println("Angka " + userInput + " yang anda cari ditemukan di array numbers.");
            System.out.println("Ada " + result.size() + " angka " + userInput + " di dalam array numbers.");
            System.out.println("yaitu pada index ke :");
            System.out.println(result);
        }else {
            System.out.println("Angka " + userInput + " yang anda cari tidak ditemukan di array numbers.");
        }

    
    }
}
