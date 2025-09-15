package challenge0032;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class LeastCommonMultiple {

    // Target: program to find the Least Common Multiple (LCM) of two numbers.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scan.nextInt();

        int result = lcm(firstNum, secondNum);

        System.out.println("LCM of " + firstNum + ", " + secondNum +": " + result);
    }

    private static int lcm(int firstNum, int secondNum) {
        int i = 1;
        while (true){
            int factor = firstNum * i;

            if(factor % secondNum == 0){
                return factor;
            }

            i++;
        }
    }
}
