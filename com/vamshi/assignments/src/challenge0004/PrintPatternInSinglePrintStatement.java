package challenge0004;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-09-2025
 */
public class PrintPatternInSinglePrintStatement {

    // Target Show the following patterns in Single print statement:
    // 1. Right Half Pyramid
    // 2. Reverse Right Half Pyramid
    // 3. Left Half Pyramid
    public static void main(String[] args) {
        System.out.println("1. Right Half Pyramid: ");
        System.out.println("*\n* *\n* * *\n* * * *\n* * * * *");

        System.out.println("-".repeat(15));

        System.out.println("2. Reverse Right Half Pyramid: ");
        System.out.println("* * * * *\n* * * *\n* * *\n* *\n*");

        System.out.println("-".repeat(15));

        System.out.println("3. Left Half Pyramid: ");
        System.out.println("        *\n      * *\n    * * *\n  * * * *\n* * * * *");
    }
}
