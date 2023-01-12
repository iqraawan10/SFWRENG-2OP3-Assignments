/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 0 and 9:");
        int n = my_scanner.nextInt();

        int n1 = n*1;
        int n2 = n*11;
        int n3 = n*111;

        int m = n1 + n2 + n3;

        System.out.println(m);

    }
}
