package challenge0031To0045.challenge0039;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class PrintPatternUsingLoops {

    // Target: program that print patterns: LEFT half pyramid, RIGHT half pyramid, REVERSE RIGHT HALF pyramid
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of levels for the pyramid patten: ");
        int levels = scan.nextInt();

        leftHalfPyramid(levels);
        rightHalfPyramid(levels);
        reversedRightHalfPyramid(levels);
    }

    private static void leftHalfPyramid(int levels) {
        System.out.println("Left Half Pyramid:");
        for (int curLevel = 1; curLevel <= levels; curLevel++) {
            String patternChar = "*";
            int patternCount = curLevel;
            while(patternCount > 0){
                System.out.print(patternChar + " ");
                patternCount--;
            }

            System.out.println("");
        }
    }

    private static void rightHalfPyramid(int levels) {

        System.out.println("\nRight Half Pyramid:");
        for (int curLevel = 1; curLevel <= levels; curLevel++) {
            String patternChar = "*";
            int patternCount = levels;
            while(patternCount - curLevel > 0){
                System.out.print("  ");
                patternCount--;
            }
            patternCount = curLevel;
            while(patternCount > 0){
                System.out.print("* ");
                patternCount--;
            }
            System.out.println("");
        }
    }

    private static void reversedRightHalfPyramid(int levels) {
        System.out.println("\nReversed Right Half Pyramid:");
        for (int curLevel = levels; curLevel > 0; curLevel--) {
            String patternChar = "*";
            int patternCount = curLevel;
            while (patternCount > 0) {
                System.out.print(patternChar + " ");
                patternCount--;
            }

            System.out.println("");
        }
    }
}
