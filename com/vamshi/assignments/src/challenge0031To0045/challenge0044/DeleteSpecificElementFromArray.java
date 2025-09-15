package challenge0031To0045.challenge0044;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class DeleteSpecificElementFromArray {

    // Target: program to return a new array deleting a specific element.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int curIdx = 0; curIdx < size; curIdx++) {
            arr[curIdx] = scan.nextInt();
        }

        System.out.print("Enter element to delete from the array: ");
        int elementToDelete = scan.nextInt();

        boolean isElementPresent = isElementPresentInArray(arr, elementToDelete);

        if (isElementPresent)
            arrayAfterDeletingTheElement(arr, elementToDelete);
        else
            System.out.println("Element is not present in the array.");
    }

    private static boolean isElementPresentInArray(int[] arr, int elementToDelete) {
        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            if (arr[curIdx] == elementToDelete)
                return true;
        }

        return false;
    }

    private static void arrayAfterDeletingTheElement(int[] arr, int elementToDelete) {
        int[] curArr = new int[arr.length - 1];

        int position = 0;
        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            if (arr[curIdx] == elementToDelete){
                position = curIdx;
                continue;
            } else if (position != 0) {
                curArr[curIdx - 1] = arr[curIdx];
            } else
                curArr[curIdx] = arr[curIdx];
        }

        System.out.println("Array after deleting the element: " + Arrays.toString(curArr));
    }
}
