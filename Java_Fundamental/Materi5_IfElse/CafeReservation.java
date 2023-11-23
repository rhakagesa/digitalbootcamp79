import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String name, gender, dayReservation;
        int age, attractive, money;

        System.out.println("============ Input ============");
        System.out.println("Welcome To Reservation Cafe");
        System.out.println();

        System.out.print("Please insert your name ? ");
        name = input.next();
        System.out.println();
        
        System.out.print("How old are you ? ");
        age = input.nextInt();
        System.out.println();

        System.out.print("What is your gender (Male/Female) ? ");
        gender = input.next();
        System.out.println();

        System.out.print("How attractive are you (1-10) ? ");
        attractive = input.nextInt();
        System.out.println();

        System.out.print("How much money do you have ? ");
        money = input.nextInt();
        System.out.println();

        System.out.print("What day do you want to make a reservation ? ");
        dayReservation = input.next();
        System.out.println();

        System.out.println("============ Output ============");
        System.out.println("Hi "+ name + ", Thank you for using our Application.");
        System.out.println("Following Results for your Reservation: ");
 
        if(dayReservation.equalsIgnoreCase("Monday")){
            if(( age <= 30 && age >= 20 ) && money >= 500){
                System.out.println("Reservation Successfully, You can Order on " + dayReservation + ". Young Night.");
            } else {
                if( age > 30 && age < 20 ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Because it is for Young Night.");
                } else if( money < 500){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Not enough money because less than $500.");
                }   
            } 
        } else if(dayReservation.equalsIgnoreCase("Tuesday")){
            if(( age <= 50 && age >= 31 ) && money >= 250){
                System.out.println("Reservation Successfully, You can Order on " + dayReservation + ". Oldest Night.");
            } else {
                if( age > 50 && age < 31 ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Because it is for Oldest Night.");
                } else if( money < 250){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Not enough money because less than $250.");
                }   
            } 
        } else if(dayReservation.equalsIgnoreCase("Wednesday")){
            if(( age <= 35 && age >= 20 ) && attractive >= 8 && gender.equalsIgnoreCase("Female") && money >= 300  ){
                System.out.println("Reservation Successfully, You can Order on " + dayReservation + ". Ladies Night.");
            } else {
                if( age > 35 && age < 20 && gender.equalsIgnoreCase("Male") ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Because it is for Ladies Night (Female Only).");
                } else if( money < 300){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Not enough money because less than $250.");
                }   
            } 
        } else if(dayReservation.equalsIgnoreCase("Thursday")){
            if(( age <= 30 && age >= 21 ) && money >= 1000 || ( gender.equalsIgnoreCase("Female") && attractive >= 8 && money >= 300) ){
                System.out.println("Reservation Successfully, You can Order on " + dayReservation + ". Party Night For Single.");
            } else {
                if( age > 30 && age < 21 ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Because it is Party Night For Single.");
                } else if( money < 1000 || ( gender.equalsIgnoreCase("Female") && attractive < 8 && money < 300)){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Not enough money because less than $1000 for Male or $300 for Female.");
                }   
            } 
        } else if(dayReservation.equalsIgnoreCase("Friday")){
            if((gender.equalsIgnoreCase("Female") && age <= 45 && age >= 31 && money >= 1000) || ( gender.equalsIgnoreCase("Male") && (age <= 25 && age >= 21) && attractive >= 8) ){
                System.out.println("Reservation Successfully, You can Order on " + dayReservation + ". Women Night.");
            } else {
                if( (gender.equalsIgnoreCase("Female") && age > 45 && age < 31 ) || ( gender.equalsIgnoreCase("Male") && (age > 25 && age < 21) && attractive < 8)  ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Because it is Party Night For Single.");
                } else if( (money < 1000 && gender.equalsIgnoreCase("Female"))){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Not enough money because less than $1000 for Male or $300 for Female.");
                }   
            } 
        } else if(dayReservation.equalsIgnoreCase("Saturday") || dayReservation.equalsIgnoreCase("Sunday")){
            if( age <= 60 && age >= 18 && money >= 100){
                System.out.println("Reservation Successfully, You can Order on " + dayReservation + ". Weekend Fredom.");
            } else {
                if( age > 60 && age < 18 ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Because it is for Weekend Freedom.");
                } else if( money < 100 ){
                    System.out.println("Sorry, you can't order on " + dayReservation + "!!. Not enough money because less than $100 for Male or $300 for Female.");
                }   
            } 
        }
    }
}
