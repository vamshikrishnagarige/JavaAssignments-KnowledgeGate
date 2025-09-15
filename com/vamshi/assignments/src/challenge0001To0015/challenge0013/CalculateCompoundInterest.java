package challenge0001To0015.challenge0013;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class CalculateCompoundInterest {

    // Target: program to calculate Compound interest.
    // Compound Interest = P(1 + R/100)t
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Simple Interest Calculation");
        System.out.print("Enter principal amount in rupees: ");
        int principalAmount = scan.nextInt();

        System.out.print("\nEnter time period in years: ");
        double timePeriod = scan.nextDouble();

        System.out.print("\nEnter rate of interest: ");
        double rateOfInterest = scan.nextDouble();

        double compoundInterest = principalAmount * Math.pow((1 + rateOfInterest/100), timePeriod);
        System.out.println("Calculated Simple Interest in lakhs: " + (compoundInterest));

//        compoundInterest();
    }

//    private static void compoundInterest() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Compound interest calculator\n");
//        System.out.print("Please enter your principle amount Rs");
//        int principle = input.nextInt();
//        System.out.print("Now, Tell me your rate of interest: ");
//        float rate = input.nextFloat();
//        System.out.print("Now, tell me for how many years are you borrowing this money: ");
//        float years = input.nextFloat();
//
//        double compInt = principle * Math.pow((1 + rate / 100), years);
//        System.out.println("Your compound interest is Rs:" + compInt);
//    }
}
