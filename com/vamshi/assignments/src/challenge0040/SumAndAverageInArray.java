package challenge0040;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class SumAndAverageInArray {

    // Target: program to find the sum and average of all elements in an array.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.print("\nEnter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = sumOfArrayElements(arr);
        float average = (float) sum /size;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }

    private static int sumOfArrayElements(int[] arr) {
        int result = 0;
        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            result += arr[curIdx];
        }

        return result;
    }
}
