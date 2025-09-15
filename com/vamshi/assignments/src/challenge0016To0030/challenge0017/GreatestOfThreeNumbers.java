package challenge0016To0030.challenge0017;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class GreatestOfThreeNumbers {

    // Target: program that determines the greatest of the three numbers.
    public static void main(String[] args) {
        int[] arr = new int[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers to determine the greatest of the three numbers.: ");

        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        int max = arr[0];

        for (int curIdx = 0; curIdx < arr.length; curIdx++) {
            if(max == arr[curIdx] || max > arr[curIdx])
                continue;
            else
                max = arr[curIdx];
        }

        System.out.println("Greatest of three numbers: " + max);
    }
}
