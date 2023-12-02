import java.util.Scanner;

public class pigDiceGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int compScore = 0, playerScore = 0, max = 6, min = 1, randomValue, tempScore;
        String rollOrHold = "roll";
    
        do{ 
            if(!rollOrHold.equalsIgnoreCase("roll")){
                    System.out.println("Input Error");
                    break;
                }   else {
                        System.out.println("Computer has " + compScore + " points.");
                        tempScore = 0;
                        for (int i = 3; i > 0; i--) {
                            if(compScore >= 50 ){
                                i = 0;
                            } else {
                                randomValue = (int)(Math.random()*(max-min+1)+min);
                                if(randomValue != 1){                
                                    System.out.println("   Computer rolled a " + randomValue);
                                    tempScore += randomValue;
                                    System.out.println("   Computer has " + tempScore + " so far this points.");
                                    if(i == 1) {
                                        compScore += tempScore;
                                        System.out.println("   Computer ends the round with " + compScore + " points.");
                                    }
                                }   else {
                                    tempScore = 0;
                                        System.out.println("   Computer rolled a " + randomValue);
                                        System.out.println("   That ends it turn.");
                                        System.out.println("   Computer ends the round with " + compScore + " points.");
                                        i = 0;
                                    }
                            } 
                        }

                        tempScore = 0;
                        
                        System.out.println("You have " + playerScore + " points.");
                        
                            
                                    while(rollOrHold.equalsIgnoreCase("roll")){           
                                    randomValue = (int)(Math.random()*(max-min+1)+min);

                                        if(randomValue != 1){                
                                            System.out.println("   You rolled a " + randomValue);
                                            tempScore += randomValue;
                                            System.out.println("   You has " + tempScore + " so far this points.");
                                                if(playerScore <= 50){
                                                System.out.print("   Would you like to" + " roll " + "again or" + " hold ? ");
                                                rollOrHold = input.next();
                                                }   else{
                                                        break;
                                                    }
                                        }   else {
                                                System.out.println("   You rolled a " + randomValue);
                                                System.out.println("   That ends it turn.");
                                                rollOrHold = "hold";
                                            }

                                    }
                                
                                if(rollOrHold.equalsIgnoreCase("hold")){
                                    playerScore += tempScore;
                                    System.out.println("  You ends the round with " + playerScore + " points.");
                                    rollOrHold = "roll";
                                }
                        }

            System.out.println();
            
        }while(compScore < 50 && playerScore < 50);

        if(compScore > playerScore){
            System.out.println("Computer win, you lose");
        }   else{
                System.out.println("Congratulations you win!");
            }
     }
}