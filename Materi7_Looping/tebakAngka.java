import java.util.Random;
import java.util.Scanner;

public class tebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randNum = new Random();
        int randomValue, inputNumber;
        String result;
        Boolean isTrue = false;

        randomValue = randNum.nextInt(0,11);

        System.out.println("Anda harus menebak angka (1 - 10) dengan batasan 3 kali kesempatan");
        System.out.println("Masukan angka : ");
        
        for (int i = 3; i > 0; i--) {        
            inputNumber = input.nextInt();
            if(inputNumber == randomValue){
                isTrue = true;
                break;
            } 
            else if(inputNumber == (randomValue-2)){
                System.out.println("hangat");
            }
            else if(inputNumber == (randomValue-1)){
                System.out.println("panas");
            }else {
                System.out.println("dingin");
            }
        }
        
        result = (isTrue) ? "Tebakan anda benar, angka yang dicari adalah " + randomValue : "Kesempatan anda habis, " + "angka yang dicari adalah " + randomValue;

        System.out.println(result);
    }
}
