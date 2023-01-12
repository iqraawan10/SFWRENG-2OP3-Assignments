/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a complete static method that finds the largest value in a 2-dimension array of ints.
 * The method should have one parameter, which is a 2d array of type int. The largest number
 * in the array should be returned as the value of the method.
 *
 * INPUT: user input a 2-dimension array of type int
 * OUTPUT: the largest number in input array
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * Input: 4  6  8
 *        5  8  9
 *        2  1  8
 * Output: 9
 *
 */

import java.util.Scanner;

public class Q5_GetMax {
    private static Scanner my_scanner;

    public static int maxValue(int[][] num){
        int max = num[0][0];
        for (int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length; j++){
                if(num[i][j] > max){
                    max = num[i][j];
                }
            }
        }
        System.out.println("Maximum value is: " + max);
        return max;
    }

    public static void main(String[] args) {
        my_scanner = new Scanner(System.in);

        System.out.println("Enter number of rows (Ex. 3):");
        int row = my_scanner.nextInt();
        System.out.println("Enter number of columns (Ex. 3):");
        int column = my_scanner.nextInt();
        int array[][] = new int[row][column];

        System.out.println("Enter the elements of the matrix with a space between each number (Ex.4 6 8 5 8 9 2 1 8):");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = my_scanner.nextInt();
            }
        }
        maxValue(array);
    }
}
