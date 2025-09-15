package challenge0016To0030.challenge0024;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class BitwiseCompliment {

    // Target: program that shows bitwise ~ of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scan.nextInt();

        System.out.println("Bitwise AND of two numbers: ~" + num +": " + (~num));
    }
}
