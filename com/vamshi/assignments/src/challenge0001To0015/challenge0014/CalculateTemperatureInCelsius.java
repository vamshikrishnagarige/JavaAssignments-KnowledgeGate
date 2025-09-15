package challenge0001To0015.challenge0014;

import java.util.Scanner;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class CalculateTemperatureInCelsius {

    // Target: program to convert Fahrenheit to Celsius
    //°C = (°F - 32) × 5/9
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit(F): ");
        float fahrenheit = scan.nextFloat();
        float celsius = (fahrenheit - 32) * 5.0f/9.0f;

        System.out.println("Your temperature is: " + celsius + "C");
    }
}
