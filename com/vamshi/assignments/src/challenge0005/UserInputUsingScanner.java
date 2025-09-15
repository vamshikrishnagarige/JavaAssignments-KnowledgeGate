package challenge0005;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class UserInputUsingScanner {

    // Target: Create a program to input name of the person and respond with "Welcome NAME to Java Assignments"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String userName = scan.nextLine();

        System.out.println("Using printf statement");
        System.out.printf("Welcome %s to Java Assignments\n\n", userName);

        System.out.println("Using println statement");
        System.out.println("Welcome " + userName + " to Java Assignments");
    }
}
