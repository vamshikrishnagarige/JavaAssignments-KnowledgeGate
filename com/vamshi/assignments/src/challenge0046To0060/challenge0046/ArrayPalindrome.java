package challenge0046To0060.challenge0046;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class ArrayPalindrome {

    // Target: program to check is the array is palindrome or not.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements for the array: ");
        for (int curIdx = 0; curIdx < size; curIdx++) {
            arr[curIdx] = scan.nextInt();
        }

        isArrayPalindrome(arr);
    }

    private static void isArrayPalindrome(int[] arr) {
        boolean isPalindromeArray = true;
        for (int curIdx = 0; curIdx < (arr.length/2); curIdx++) {
            if (arr[curIdx] != arr[arr.length - curIdx - 1]) {
                isPalindromeArray = false;
                break;
            }
        }

        if(isPalindromeArray)
            System.out.println(Arrays.toString(arr) + " is a palindrome array");
        else
            System.out.println(Arrays.toString(arr) + " is not a palindrome array");
    }
}
