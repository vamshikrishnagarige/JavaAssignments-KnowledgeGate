package challenge0008;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class ArithmeticOperations {

    // Target: program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers to be used for arithmetic operations: ");
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        
        ArithmeticOperations ops = new ArithmeticOperations();
        ops.additionOfTwoNumbers(firstNum, secondNum);
        ops.substractionOfTwoNumbers(firstNum, secondNum);
        ops.multiplicationOfTwoNumbers(firstNum, secondNum);
        ops.divisionOfTwoNumbers(firstNum, secondNum);
        ops.modulusOfTwoNumbers(firstNum, secondNum);
    }

    private void additionOfTwoNumbers(int firstNum, int secondNum) {
        System.out.println("Addition of Numbers: " + (firstNum + secondNum));
    }

    private void substractionOfTwoNumbers(int firstNum, int secondNum) {
        System.out.println("Substraction of Numbers: " + (firstNum - secondNum));
    }

    private void multiplicationOfTwoNumbers(int firstNum, int secondNum) {
        System.out.println("Multiplication of Numbers: " + (firstNum * secondNum));
    }

    private void divisionOfTwoNumbers(int firstNum, int secondNum) {
        System.out.println("Division of Numbers: " + (firstNum / secondNum));
    }

    private void modulusOfTwoNumbers(int firstNum, int secondNum) {
        System.out.println("Modulus of Numbers: " + (firstNum % secondNum));
    }
}
