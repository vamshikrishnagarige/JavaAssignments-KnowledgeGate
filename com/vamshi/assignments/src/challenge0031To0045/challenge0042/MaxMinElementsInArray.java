package challenge0031To0045.challenge0042;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class MaxMinElementsInArray {

    // Target: program to find the maximum and minimum element in an array.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int curIdx = 0; curIdx < size; curIdx++) {
            arr[curIdx] = scan.nextInt();
        }

        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Min element within array: " + min);
        System.out.println("Max element within array: " + max);
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            min = Math.min(min, arr[curIdx]);
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            max = Math.max(max, arr[curIdx]);
        }
        return max;
    }
}
