package challenge0001To0015.challenge0011;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class AreaOfTriangle {

    // Target: program to calculate the Area of a Triangle.
    //Area of triangle = ½*B*H
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Area of a Triangle Calculation");
        System.out.print("Enter base in cms: ");
        double base = scan.nextDouble();

        System.out.print("Enter height in cms: ");
        double height = scan.nextDouble();

        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
}
