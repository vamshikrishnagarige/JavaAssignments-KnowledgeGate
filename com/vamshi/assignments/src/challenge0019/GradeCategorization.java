package challenge0019;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class GradeCategorization {

    // Target: program that calculates grades based on marks
    //A -> above 90% B -> above 75%
    //C -> above 60% D -> above 30%
    //E -> below 30%
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks to identify your grade: ");

        int marks = scan.nextInt();

        char grade;

        if(marks >= 90) grade = 'A';
        else if (marks >= 75 && marks < 90) grade='B';
        else if (marks >= 60 && marks < 75) grade='C';
        else if (marks >= 30 && marks < 60) grade='D';
        else grade='E';

        System.out.println("You fall in grade: " + grade);
    }
}
