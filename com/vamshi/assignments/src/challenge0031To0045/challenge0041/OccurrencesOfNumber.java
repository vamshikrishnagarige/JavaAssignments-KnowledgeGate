package challenge0031To0045.challenge0041;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class OccurrencesOfNumber {

    // Target: program to find number of occurrences of an element in an array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.print("Enter a number to find its occurrences in the above given number: ");
        int occurringNum = scan.nextInt();

        int originalNum = num;

        int count = 0;
        while(num > 0){
            if(num%10 == occurringNum)
                count++;

            num /= 10;
        }

        System.out.println("Number of occurrences of " + occurringNum + " in " + originalNum + " is: " + count);
    }
}
