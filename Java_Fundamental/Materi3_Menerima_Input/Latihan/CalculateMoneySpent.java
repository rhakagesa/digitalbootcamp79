import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        String day[] = {"Ahad", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        String name;
        int moneySpent, total, totalDay;
        double average;
    
        System.out.print("Hey, what your name? ");
        name = input.next(); 
        
        total = 0;
        totalDay = day.length;

        for (int i = 0; i < day.length; i++) {
            System.out.print("How much money did u spend at cafe on " + day[i] + " ? ");
            moneySpent = input.nextInt();
            total += moneySpent;
        }

        average = total / totalDay;

        System.out.println("The Result : ");
        
        System.out.println("Hi "+ name + ".");
        System.out.println("Your total expenditure at cafe this week is $"+ total);
        System.out.println("With an Average daily expenditure of $ "+ average);
    }
}
