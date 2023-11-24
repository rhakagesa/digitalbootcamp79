import java.util.Random;
import java.util.Scanner;

public class pigDiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int compScore = 0, playerScore = 0, randomValue;
        String rollOrHold = "roll";
    
        do{ 
            System.out.println("Computer has " + compScore + " points.");
            for (int i = 3; i > 0; i--) {
                randomValue = rand.nextInt(1,7);
                if(randomValue != 1){                
                    System.out.println("   Computer rolled a " + randomValue);
                    compScore += randomValue;
                    System.out.println("   Computer has " + compScore + " so far this points.");
                    if(i == 1){
                        System.out.println("   Computer ends the round with " + compScore + " points.");
                    }
                } else {
                    System.out.println("   Computer ends the round with " + compScore + " points.");
                }

            }
            
            System.out.println("You have " + playerScore + " points.");
               
                while(rollOrHold.equalsIgnoreCase("roll")){            
                randomValue = rand.nextInt(1,7);

                if(randomValue != 1){                
                    System.out.println("   You rolled a " + randomValue);
                    playerScore += randomValue;
                    System.out.println("   You has " + playerScore + " so far this points.");
                    System.out.print("   Would you like to" + " roll " + "again or" + " hold ? ");
                    rollOrHold = input.next();
                } else {
                    System.out.println("  You ends the round with " + playerScore + " points.");
                }
            }
            if(rollOrHold.equalsIgnoreCase("hold")){
                System.out.println("  You ends the round with " + playerScore + " points.");
                rollOrHold = "roll";
            }

            System.out.println();
            
        }while(compScore >= 50 || playerScore >= 50);
     }
}
