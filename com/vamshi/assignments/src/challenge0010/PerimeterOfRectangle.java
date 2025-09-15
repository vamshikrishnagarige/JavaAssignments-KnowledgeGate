package challenge0010;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class PerimeterOfRectangle {

    // Target: program to calculate Perimeter of a rectangle
    // Perimeter of rectangle ABCD = A+B+C+D
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perimeter of a Rectangle Calculation");
        System.out.print("Please enter all 4 sides in cms: ");
        double firstNum = scan.nextDouble();
        double secondNum = scan.nextDouble();
        double thirdNum = scan.nextDouble();
        double fourthNum = scan.nextDouble();

        System.out.println("Perimeter of a rectangle: " + (firstNum + secondNum + thirdNum + fourthNum));
    }
}
