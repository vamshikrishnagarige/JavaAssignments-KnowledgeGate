package challenge0016To0030.challenge0021;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class BitwiseAND {

    // Target: program that shows bitwise AND of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        System.out.println("Bitwise AND of two numbers: " + firstNum + " & " + secondNum +": " + (firstNum & secondNum));
    }
}
