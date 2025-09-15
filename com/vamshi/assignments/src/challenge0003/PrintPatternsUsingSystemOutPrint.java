package challenge0003;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class PrintPatternsUsingSystemOutPrint {
    // Target Show the following patterns:
    // 1. Right Half Pyramid
    // 2. Reverse Right Half Pyramid
    // 3. Left Half Pyramid

    public static void main(String[] args) {
        rightHalfPyramid();
        reverseRightHalfPyramid();
        leftHalfPyramid();
    }

    private static void rightHalfPyramid() {
        System.out.println("1. Right Half Pyramid: ");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        System.out.println("-".repeat(15));
    }

    private static void reverseRightHalfPyramid() {
        System.out.println("2. Reverse Right Half Pyramid: ");
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

        System.out.println("-".repeat(15));
    }

    private static void leftHalfPyramid() {
        System.out.println("3. Left Half Pyramid: ");
        System.out.println("         *");
        System.out.println("       * *");
        System.out.println("     * * *");
        System.out.println("   * * * *");
        System.out.println("* * * * *");
    }
}
