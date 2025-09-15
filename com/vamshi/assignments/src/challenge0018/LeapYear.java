package challenge0018;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 14-09-2025
 */
public class LeapYear {

    // Target: program that determines if a given year is a leap year
    //(considering conditions like divisible by 4 but not 100, unless also
    //divisible by 400).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = scan.nextInt();

        if(year%400 == 0 ||  (year%4 == 0 && year%100 != 0))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
