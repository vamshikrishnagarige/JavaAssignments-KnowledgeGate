package challenge0015;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class DetermineNumber {

    // Target: a program that determines if a number is positive, negative, or zero.
    public static void main(String[] args) {
        int[] arr = new int[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Categories: ");
        System.out.println("1. Positive");
        System.out.println("2. Negative");
        System.out.println("3. Zero");
        System.out.println("Enter three numbers to determine whether they belong to one of the below category: ");

        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        System.out.println("Entered values belong to the categories: ");
        for (int curIndex = 0; curIndex < arr.length; curIndex++) {
            if(arr[curIndex] > 0)
                System.out.println("Value is positive: " + arr[curIndex]);
            else if (arr[curIndex] < 0)
                System.out.println("Value is negative: " + arr[curIndex]);
            else
                System.out.println("Value is Zero: " + arr[curIndex]);
        }
    }
}
