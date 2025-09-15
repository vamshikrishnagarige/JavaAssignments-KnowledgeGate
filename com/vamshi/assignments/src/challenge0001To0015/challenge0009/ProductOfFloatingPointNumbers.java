package challenge0001To0015.challenge0009;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class ProductOfFloatingPointNumbers {

    // Target: program to calculate product of two floating points numbers
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers to be swapped: ");
        float firstNum = scan.nextFloat();
        float secondNum = scan.nextFloat();

        System.out.println("Product of floating points numbers: " + (firstNum * secondNum));
    }
}
