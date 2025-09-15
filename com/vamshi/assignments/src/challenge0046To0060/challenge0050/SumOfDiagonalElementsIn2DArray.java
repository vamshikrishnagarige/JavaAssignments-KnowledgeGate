package challenge0046To0060.challenge0050;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class SumOfDiagonalElementsIn2DArray {

    // Target: program to find the sum of two diagonal elements.
    public static void main(String[] args) {
        System.out.println("Program to do sum of all diagonal elements in a 2D array.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows for an array: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of rows for an array: ");
        int cols = scan.nextInt();

        if(rows != cols && (rows%2 ==0 && cols%2 == 1)){
            System.out.println("Invalid 2D array");
        }
        else{
            int[][] twoDimensionArr = create2DArray(scan, rows, cols);

            int sum = 0;

            print2DArray(twoDimensionArr);
            for (int rowIdx = 0; rowIdx < rows; rowIdx++) {
                for (int colIdx = 0; colIdx < cols; colIdx++) {
                    if (rowIdx + colIdx == cols - 1)
                        sum += twoDimensionArr[rowIdx][colIdx];
                    else if((rowIdx == colIdx))
                        sum += twoDimensionArr[rowIdx][colIdx];
                }
            }

            System.out.println("Result: " + sum);
        }
    }

    private static int[][] create2DArray(Scanner scan, int rows, int cols) {

        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements for the array: ");
        for (int rowIdx = 0; rowIdx < rows; rowIdx++) {
            for (int colIdx = 0; colIdx < cols; colIdx++) {
                arr[rowIdx][colIdx] = scan.nextInt();
            }
        }

        return  arr;
    }

    private static void print2DArray(int[][] arr){
        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {
            for (int colIdx = 0; colIdx < arr[rowIdx].length; colIdx++) {
                if (colIdx == arr[colIdx].length - 1)
                    System.out.println(arr[rowIdx][colIdx]);
                else
                    System.out.print(arr[rowIdx][colIdx] + "  ");
            }
        }
    }
}
