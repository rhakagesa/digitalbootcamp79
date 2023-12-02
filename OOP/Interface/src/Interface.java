import java.util.Scanner;

import Interface.MotorMatic;
import Type.Variu;
import User.Rider;

public class Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLoop = true;
        int action;

        MotorMatic Variu150 = new Variu();
        Rider person = new Rider(Variu150, "Rhaka");

        do {
            System.out.println("=============Aplikasi Interface=============");
            System.out.println("[1] Menyalakan mesin");
            System.out.println("[2] Mematikan mesin");
            System.out.println("[3] Menambah kecepatan");
            System.out.println("[4] Mengurangi kecepatan");
            System.out.println("[5] Turun dari motor");
            System.out.println("============================================");
            
            action = input.nextInt();

            if(action == 1){
                person.startEngine();                
            } else if( action == 2){
                person.stopEngine();
            } else if( action == 3){
                person.increaseSpeed();
            } else if ( action == 4){
                person.decreaseSpeed();
            } else if( action == 5){
                isLoop = false;
                System.out.println("Program Berhenti");
            }

        } while (isLoop);

    }
}
