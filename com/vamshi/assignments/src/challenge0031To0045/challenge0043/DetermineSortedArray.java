package challenge0031To0045.challenge0043;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class DetermineSortedArray {

    // Target: program to check if the given array is sorted.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int curIdx = 0; curIdx < size; curIdx++) {
            arr[curIdx] = scan.nextInt();
        }

        boolean isSorted = isArraySorted(arr);
        if (isSorted)
            System.out.println("Array is sorted.");
        else
            System.out.println("Array is not sorted.");
    }

    private static boolean isArraySorted(int[] arr) {
        for (int curIdx = 1; curIdx < arr.length; curIdx++) {
            if (arr[curIdx] < arr[curIdx - 1]) {
                return false;
            }
        }

        return true;
    }
}
