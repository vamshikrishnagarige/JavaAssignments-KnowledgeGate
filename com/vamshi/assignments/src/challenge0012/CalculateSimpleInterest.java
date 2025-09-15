package challenge0012;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class CalculateSimpleInterest {

    // Target: a program to calculate simple interest.
    // Simple Interest = (P x T x R)/100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Simple Interest Calculation");
        System.out.print("Enter principal amount in rupees: ");
        int principalAmount = scan.nextInt();

        System.out.print("\nEnter time period in years: ");
        double timePeriod = scan.nextDouble();

        System.out.print("\nEnter rate of interest: ");
        double rateOfInterest = scan.nextDouble();

        double simpleInterest = (principalAmount * timePeriod * rateOfInterest)/100;
        System.out.println("Calculated Simple Interest in lakhs: " + (simpleInterest));

//        simpleInterest();
    }

//    private static void simpleInterest(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Simple Interest Calculator\n");
//        System.out.print("Please enter your principle amount Rs");
//        int principle = input.nextInt();
//        System.out.print("Now, Tell me your rate of interest: ");
//        float rate = input.nextFloat();
//        System.out.print("Now, tell me for how many years are you borrowing this money: ");
//        float years = input.nextFloat();
//
//        float interest = (principle *  rate * years) / 100;
//        System.out.println("\n\n Your Simple interest is Rs:" + interest);
//    }
}
