import java.util.Scanner;

class AnnuityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly payout: ");
        double monthlyPayout = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 2.5): ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 100 / 12;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        int totalMonths = years * 12;

        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyRate, -totalMonths)) / monthlyRate;

        System.out.printf("Present Value Needed Today: $%.2f\n", presentValue);
    }
}
