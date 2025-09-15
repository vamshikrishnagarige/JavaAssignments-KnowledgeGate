package challenge0031To0045.challenge0037;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 15-09-2025
 */
public class ArmstrongNumber {

    // Target: program to check if a number is an Armstrong number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find if it is an armstrong number: ");
        int num = scan.nextInt();

        if(num == isArmstrongNumber(num))
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num + " is not an armstrong number");
    }

    public static int isArmstrongNumber(int num){
        int count = 0;
        int reversedNum = 0;
        while (num > 0){
            reversedNum = (reversedNum*10) + (num%10);
            num /= 10;
            count++;
        }

        while (reversedNum > 0){
            num += Math.pow(reversedNum%10, count);
            reversedNum /= 10;
        }
        return num;
    }
}
