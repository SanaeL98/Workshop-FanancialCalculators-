import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 1.75): ");
        double annualRate = input.nextDouble();
        double dailyRate = annualRate / 100 / 365;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        int totalDays = years * 365;

        double futureValue = principal * Math.pow(1 + dailyRate, totalDays);
        double interestEarned = futureValue - principal;

        System.out.printf("Future Value: $%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f\n", interestEarned);
    }
}