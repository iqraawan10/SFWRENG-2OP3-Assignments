/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 3 (20 marks)
 * 
 * Write a Java program to print the result of first user input real number divided by the second user input real number.
 * 
 * INPUT: user input real number x, and user input real number y
 * OUTPUT: the result of x divided y. (The result should be printed with two significant digits after the decimal point.)
 * 
 * Hint1: you may use java.util.Scanner to take user input real numbers.
 * Hint2: you may use format string of System.out.printf() when printing the result.
 * 
 */

import java.util.Scanner;

public class Q3_DivideTwoNumbers {
	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);

		System.out.println("Please enter the first real number:");
		double x = my_scanner.nextDouble();

		System.out.println("Please enter the second real number:");
		double y = my_scanner.nextDouble();

		double result = (x/y);

		System.out.printf("Result: %1.2f\n", result);
	}
}
