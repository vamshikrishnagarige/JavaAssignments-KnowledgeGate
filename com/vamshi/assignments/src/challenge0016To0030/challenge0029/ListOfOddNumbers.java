package challenge0016To0030.challenge0029;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class ListOfOddNumbers {

    // Target: a program to sum all odd numbers from 1 to a specified number N.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a finite number: ");

        int num = scan.nextInt();

        if(num <= 0){
            System.out.println("invalid number.");
            System.exit(1);
        }
        else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1)
                    System.out.print(i + ", ");
            }
        }
    }
}
