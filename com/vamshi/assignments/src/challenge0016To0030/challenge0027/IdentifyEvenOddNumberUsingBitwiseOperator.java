package challenge0016To0030.challenge0027;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class IdentifyEvenOddNumberUsingBitwiseOperator {

    // Target: program to check if a given number is even or odd using
    //bitwise operators.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if((num & 1) == 1)
            System.out.println(num + " is odd number.");
        else
            System.out.println(num + " is even number.");
    }
}
