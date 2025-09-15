package challenge0031To0045.challenge0038;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class PalindromeNumber {

    // Target: program to verify if a number is a palindrome.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find if it is a palindrome number: ");
        int num = scan.nextInt();

        if(num == reversedNumber(num))
            System.out.println(num + " is a palindrome number");
        else
            System.out.println(num + " is not a palindrome number");
    }

    private static int reversedNumber(int num) {
        int reversedNum = 0;
        while (num > 0){
            reversedNum = (reversedNum*10) + (num%10);
            num /= 10;
        }
        return reversedNum;
    }
}
