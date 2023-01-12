/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;

public class Q2_LambdaExpression {
    private static Scanner my_scanner;

    interface calc_function{
        public double calc (double x, double y);
    }
    public static void lambda(double X, double Y) throws ArithmeticException{
        calc_function ca = (x, y) -> {return Math.sqrt((x*x)-(y*y));};

        if (X<Y){
            throw new ArithmeticException("X must be greater than Y");
        }
        System.out.printf("Answer: %.4f", ca.calc(X,Y));

    }

    public static void main(String[] args){

        my_scanner = new Scanner(System.in);

        System.out.println("Enter a value for x:");
        double X = my_scanner.nextDouble();
        System.out.println("Enter a value for y:");
        double Y = my_scanner.nextDouble();

        try{
            lambda(X,Y);
        }
        catch (ArithmeticException e){
            System.out.println("X must be greater than Y");
        }
    }

}
