package MortgageCalculator;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount (principal): ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 7.625): ");
        double annualRate = input.nextDouble();
        double monthlyRate = annualRate / 100 / 12;

        System.out.print("Enter loan term in years: ");
        int years = input.nextInt();
        int totalMonths = years * 12;

        double monthlyPayment = (principal * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                (Math.pow(1 + monthlyRate, totalMonths) - 1);

        double totalPayment = monthlyPayment * totalMonths;
        double totalInterest = totalPayment - principal;

        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);
        }
    }
