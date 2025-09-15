package challenge0031;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class SumOfDigits {

    // Target: program that computes the sum of the digits of an integer.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a finite number: ");

        int num = scan.nextInt();
        int sum = 0;

        while (num > 0){
            sum += num %10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
