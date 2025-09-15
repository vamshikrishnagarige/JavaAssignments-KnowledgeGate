package challenge0026;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class BitwiseRightShift {

    // Target: program that shows bitwise RIGHT SHIFT of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scan.nextInt();

        System.out.println("Bitwise LEFT SHIFT of a number: " + num + " >> 4:" + (num >> 4));
    }
}
