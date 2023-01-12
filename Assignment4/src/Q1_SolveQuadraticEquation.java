/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import java.util.Scanner;

public class Q1_SolveQuadraticEquation {
    private static Scanner my_scanner;

    static void roots(int a, int b, int c){
        double discriminant = b*b-4.00*a*c;
        double ans = Math.sqrt(discriminant);

        if (discriminant > 0) {
            double root1 = (-b + ans) / (2.00*a);
            double root2 = (-b - ans) / (2.00*a);
            System.out.printf("The roots are %.2f and %.2f", root1, root2);
        }
        else if (discriminant == 0) {
            double root = -b / (2.00*a);
            System.out.printf("The root is: %.2f", root);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }

    public static void main(String[] Strings) {
        my_scanner = new Scanner(System.in);

        System.out.println("a=");
        int a = my_scanner.nextInt();
        System.out.println("b=");
        int b = my_scanner.nextInt();
        System.out.println("c=");
        int c = my_scanner.nextInt();

        roots(a,b,c);
    }
}
