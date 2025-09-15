package challenge0016;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class EvenOrOdd {

    // Target: program that determines if a number is odd or even.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number to identify if it is an even or odd number: ");
        int number = scan.nextInt();

        if (number%2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
}
