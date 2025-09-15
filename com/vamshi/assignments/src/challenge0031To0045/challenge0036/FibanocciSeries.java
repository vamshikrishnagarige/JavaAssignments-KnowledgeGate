package challenge0031To0045.challenge0036;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class FibanocciSeries {

    // Target: program to print the Fibonacci series up to a certain number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number till which fibonacci series will be printed: ");
        int num = scan.nextInt();

        if(num < 0)
            System.out.println("Invalid number.");

        System.out.print("0 ");

        if (num == 0)
            System.out.println("Invalid number.");

        System.out.print("1 ");

        int prevNum = 0, curNum = 1;
        while(prevNum + curNum <= num){
            System.out.print((prevNum + curNum) + " ");
            curNum = curNum + prevNum;
            prevNum = curNum - prevNum;
        }
    }
}
