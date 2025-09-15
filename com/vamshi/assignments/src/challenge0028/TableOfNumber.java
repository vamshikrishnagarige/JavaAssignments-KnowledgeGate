package challenge0028;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class TableOfNumber {

    // Target: a program that prints the multiplication table for a given number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to get table: ");

        int num = scan.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
