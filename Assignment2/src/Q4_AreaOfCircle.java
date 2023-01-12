/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.util.Scanner;

public class Q4_AreaOfCircle {
	public static void main(String[] args) {
		Scanner my_scanner = new Scanner(System.in);

		System.out.println("Please enter a radius:");
		double radius = my_scanner.nextDouble();

		double area = Math.PI*radius*radius;
		double perimeter = 2*Math.PI*radius;

		System.out.printf("The area is: %1.2f\n", area);
		System.out.printf("The perimeter is: %1.2f\n", perimeter);

	}
}
