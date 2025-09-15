package challenge0031To0045.challenge0045;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class ReversedArray {

    // Target: program to reverse an array.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int curIdx = 0; curIdx < size; curIdx++) {
            arr[curIdx] = scan.nextInt();
        }

        printReversedArray(arr);
    }

    private static void printReversedArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            reversedArray[curIdx] = arr[arr.length - curIdx - 1];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}
