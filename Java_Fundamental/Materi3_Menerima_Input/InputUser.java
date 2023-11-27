import java.util.Scanner;

public class InputUser{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Name : ");
        keyboard.next();

        System.out.print("Email : ");
        keyboard.next();

        System.out.print("Age : ");
        keyboard.nextInt();

        System.out.print("Height : ");
        keyboard.nextDouble();
    }
}