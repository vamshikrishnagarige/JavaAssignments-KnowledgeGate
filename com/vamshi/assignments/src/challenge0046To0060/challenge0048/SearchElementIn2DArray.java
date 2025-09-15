package challenge0046To0060.challenge0048;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class SearchElementIn2DArray {

    // Target: program to search an element in a 2-D array.
    public static void main(String[] args) {

        System.out.println("Program to find the first occurrence of an element in a 2D array.");

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

        System.out.println("Enter element to be searched: ");
        int elementToBeSearched = scan.nextInt();

        findArrayElement(arr, elementToBeSearched);
    }

    private static void findArrayElement(int[][] arr, int elementToBeSearched) {
        boolean isFound = false;
        int row = 0, col = 0;

        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = 0; colIdx < arr[rowIdx].length; colIdx++) {
                if (arr[rowIdx][colIdx] == elementToBeSearched) {
                    isFound = true;
                    row = rowIdx;
                    col = colIdx;
                    break;
                }
            }
        }

        if (isFound)
            System.out.println("Element " + elementToBeSearched + " is found at position: " + row +", " + col);
        else
            System.out.println("Element " + elementToBeSearched + " is not found.");
    }
}
