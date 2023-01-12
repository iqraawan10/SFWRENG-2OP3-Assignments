/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 2 (20 marks)
 * 
 * Write a Java program to print the sum of two user input integer numbers.
 * 
 * INPUT: two user input integer numbers
 * OUTPUT: the sum of the two user input integer numbers
 * 
 * Hint1: you may use java.util.Scanner to take user input numbers.
 * 
 */

import java.util.Scanner;


public class Q2_SumTwoNumbers {
	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		int val1 = my_scanner.nextInt();

		System.out.println("Please enter the second number:");
		int val2 = my_scanner.nextInt();

		int sum = val1 + val2;

		System.out.println("The sum is:" + sum);

	}
}
