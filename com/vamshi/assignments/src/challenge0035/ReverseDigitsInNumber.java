package challenge0035;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class ReverseDigitsInNumber {

    // Target: program to reverse the digits of a number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int result = 0;
        while (num > 0){
            result = result*10 + (num%10);
            num /= 10;
        }

        System.out.println("Reverse digits of number " + num + ": " + result);
    }
}
