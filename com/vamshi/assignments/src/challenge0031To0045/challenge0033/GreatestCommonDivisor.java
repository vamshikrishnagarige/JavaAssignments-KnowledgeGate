package challenge0031To0045.challenge0033;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class GreatestCommonDivisor {

    // Target: program to find the Greatest Common Divisor (GCD) of two integers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scan.nextInt();

        System.out.print("Enter first number: ");
        int secondNum = scan.nextInt();

        int result = gcd(firstNum, secondNum);
        System.out.printf("GCD of %d, %d: %d", firstNum, secondNum, result);
    }

    private static int gcd(int firstNum, int secondNum) {
        int gcd = 1;
        int factor = 2;
        int min = Math.min(firstNum, secondNum);
        while(factor <= min){
            if(firstNum %factor == 0 && secondNum % 2 == 0)
                gcd = factor;

            factor++;
        }

        return  gcd;
    }
}
