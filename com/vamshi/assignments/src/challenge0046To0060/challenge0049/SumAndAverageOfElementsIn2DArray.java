package challenge0046To0060.challenge0049;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class SumAndAverageOfElementsIn2DArray {

    // Target: program to do sum and average of all elements in a 2-D array.
    public static void main(String[] args) {
        System.out.println("Program to do sum and average of all element in a 2D array.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows for an array: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of rows for an array: ");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements for the array: ");
        for (int rowIdx = 0; rowIdx < rows; rowIdx++) {
            for (int colIdx = 0; colIdx < cols; colIdx++) {
                arr[rowIdx][colIdx] = scan.nextInt();
            }
        }

        int sum = sumOfElementsIn2DArray(arr);
        int average = sum/(rows * cols);

        System.out.println("Sum of all elements in the 2D array: " + sum);
        System.out.println("Average of all elements in the 2D array: " + average);
    }

    private static int sumOfElementsIn2DArray(int[][] arr) {
        int sum = 0;
        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = 0; colIdx < arr[rowIdx].length; colIdx++) {
                sum += arr[rowIdx][colIdx];
            }
        }

        return sum;
    }
}
