package challenge0022;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class BitwiseOR {

    // Target: program that shows bitwise OR of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        System.out.println("Bitwise OR of two numbers: " + firstNum + " | " + secondNum +": " + (firstNum | secondNum));
    }
}
