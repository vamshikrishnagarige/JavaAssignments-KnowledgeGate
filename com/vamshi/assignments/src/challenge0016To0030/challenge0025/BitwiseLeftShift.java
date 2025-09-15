package challenge0016To0030.challenge0025;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class BitwiseLeftShift {

    // Target: program that shows bitwise << of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to demonstrate LEFT SHIFT operation: ");

        int num = scan.nextInt();

        System.out.println("Bitwise LEFT SHIFT of a number: " + num + " << 4:" + (num << 4));
    }
}
