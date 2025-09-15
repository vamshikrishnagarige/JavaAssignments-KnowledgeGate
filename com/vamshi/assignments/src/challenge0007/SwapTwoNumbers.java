package challenge0007;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class SwapTwoNumbers {

    // Target: program to swap two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers to be swapped: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();

        System.out.println("Before Swapping: ");
        System.out.println("firstNum: " + firstNum);
        System.out.println("secondNum: " + secondNum);

        SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
        swapTwoNumbers.usingTempVariable(firstNum, secondNum);
        swapTwoNumbers.usingArithmeticOperators(firstNum, secondNum);
    }

    private void usingTempVariable(int firstNum, int secondNum) {
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("\nusingTempVariable");
        System.out.println("After Swapping: ");
        System.out.println("firstNum: " + firstNum);
        System.out.println("secondNum: " + secondNum);
    }

    private void usingArithmeticOperators(int firstNum, int secondNum) {
        secondNum = firstNum + secondNum;
        firstNum = secondNum - firstNum;
        secondNum = secondNum - firstNum;

        System.out.println("\nusingArithmeticOperators");
        System.out.println("After Swapping: ");
        System.out.println("firstNum: " + firstNum);
        System.out.println("secondNum: " + secondNum);
    }
}
