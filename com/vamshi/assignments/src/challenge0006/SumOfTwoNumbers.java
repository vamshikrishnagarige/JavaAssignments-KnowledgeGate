package challenge0006;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class SumOfTwoNumbers {

    // Target: program to add two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number for addition: ");
        int firstNum = scan.nextInt();

        System.out.print("Enter the second number for addition: ");
        int secondNum = scan.nextInt();

        System.out.println("\nCalculating result within print statement of the sum of values");
        System.out.println("Result: " + (firstNum+secondNum));

        int result = (firstNum+secondNum);
        System.out.println("\nCalculating result before and using result variable to print the sum of values");
        System.out.println("Result: " + result);
    }
}
