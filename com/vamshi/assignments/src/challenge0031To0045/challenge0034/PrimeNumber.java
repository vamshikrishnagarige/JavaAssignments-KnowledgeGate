package challenge0031To0045.challenge0034;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class PrimeNumber {

    // target: a program to check whether a given number is prime.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        boolean isPrime = true;
        for (int curNum = 2; curNum < num; curNum++) {
            if(num % curNum == 0)
                isPrime = false;
        }

        if(isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
