package challenge0030;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class FactorialOfNumber {

    // Target: function that calculates the factorial of a given number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a finite number: ");

        int num = scan.nextInt();

        System.out.println("Factorial of number " + num + ": " + factorial(num));
    }

    private static int factorial(int num) {
        if(num < 2)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
