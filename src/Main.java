import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Hello, and welcome to the program for calculating your restaurant tip!");

        System.out.print("How many people are in your group eating at the restaurant (including yourself)? ");
        int guestNumber = scan.nextInt();

        System.out.println();

        System.out.print("How much do you want to tip, as an integer (omit the percent symbol)? ");
        int tipPercent = scan.nextInt();

        double currentInput = 0;

        TipCalculator tip1 = new TipCalculator(guestNumber, tipPercent);

        while (currentInput != -1) {
            System.out.print("Please enter a cost in dollars and cents (-1 to end) ");
            currentInput = scan.nextDouble();
            if (currentInput != -1) {
                tip1.addMeal(currentInput);
            }
        }

        System.out.println("------------------------------------");

        System.out.println("Total Bill Before Tip: " + tip1.getTotalBeforeTip());
        System.out.println("Tip Percentage: " + tip1.getTipPercent());
        System.out.println("Total Tip: " + tip1.tipAmount());
        System.out.println("Total Bill With Tip: " + tip1.totalBill());
        System.out.println("Per Person Cost Before Tip: " + tip1.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: " + tip1.perPersonTipAmount());
        System.out.println("Total Cost Per Person: " + tip1.perPersonTotalCost());
    }
}
