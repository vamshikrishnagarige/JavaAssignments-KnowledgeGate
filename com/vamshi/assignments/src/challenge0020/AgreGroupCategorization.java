package challenge0020;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class AgreGroupCategorization {

    //Target: program that categorize a person into different age groups
    //Child -> below 13 Teen -> below 20
    //Adult -> below 60 Senior-> above 60
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter marks to identify your ageGroup: ");

        int age = scan.nextInt();

        String ageGroup;

        if(age >= 60) ageGroup = "Senior";
        else if (age >= 20 && age < 60) ageGroup ="Adult";
        else if (age >= 13 && age < 20) ageGroup ="Teen";
        else ageGroup ="Child";

        System.out.println("You fall in age group: " + ageGroup);
    }
}
