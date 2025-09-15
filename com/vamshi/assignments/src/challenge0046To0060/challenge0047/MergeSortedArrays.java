package challenge0046To0060.challenge0047;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class MergeSortedArrays {

    // Target: program to merge two sorted arrays.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArray = userInputForArray(scan);
        int[] secondArray = userInputForArray(scan);

        boolean isFirstArraySorted = sortedArray(firstArray);
        boolean isSecondArraySorted = sortedArray(firstArray);

        if(isFirstArraySorted && isSecondArraySorted)
            mergeArrays(firstArray, secondArray);
    }

    private static int[] userInputForArray(Scanner scan) {
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int curIdx = 0; curIdx < size; curIdx++) {
            arr[curIdx] = scan.nextInt();
        }

        return arr;
    }

    private static boolean sortedArray(int[] curArray) {
        for (int curIdx = 0; curIdx < curArray.length - 1; curIdx++) {
            if (curArray[curIdx] > curArray[curIdx + 1])
                return false;
        }

        return true;
    }

    private static void mergeArrays(int[] firstArray, int[] secondArray) {
        int mergedArrLength = firstArray.length + secondArray.length;
        int[] mergedArray = new int[mergedArrLength];

        int mergedArrIdx = 0, firsArrIdx = 0, secondArrIdx = 0;

        while (firsArrIdx < firstArray.length && secondArrIdx < secondArray.length){
            if(firstArray[firsArrIdx] <= secondArray[secondArrIdx])
                mergedArray[mergedArrIdx++] = firstArray[firsArrIdx++];
            else
                mergedArray[mergedArrIdx++] = secondArray[secondArrIdx++];
        }

        while (firsArrIdx < firstArray.length)
            mergedArray[mergedArrIdx++] = firstArray[firsArrIdx++];

        while (secondArrIdx < secondArray.length)
            mergedArray[mergedArrIdx++] = secondArray[secondArrIdx++];

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
