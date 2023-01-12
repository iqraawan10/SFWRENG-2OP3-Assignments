/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a java program to compute the transpose of a user input matrix,
 * whose elements are all integers.
 *
 * Converting rows of a matrix into columns and columns of a matrix into
 * row is called transpose of a matrix.
 *
 * INPUT: user input matrix (2D array).
 * OUTPUT: the transpose of input matrix.
 *
 * Note: considering how to take users' input, you can set some rules
 * (give users some hints) to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * INPUT: 4  6  8
 *        5  8  9
 *        2  1  8
 *
 * OUTPUT: 4  5  2
 *         6  8  1
 *         8  9  8
 *
 */

import java.util.Scanner;

public class Q4_TransposeMatrix {
    private static Scanner my_scanner;

    private static void initialMatrix(int row, int column, int[][] matrix){
        for (int i =0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    private static void transpose (int row, int column, int[][] matrix){
        for (int i = 0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(matrix[j][i]+ "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        my_scanner = new Scanner(System.in);

        System.out.println("Enter number of rows (Ex. 3):");
        int row = my_scanner.nextInt();
        System.out.println("Enter number of columns (Ex. 3):");
        int column = my_scanner.nextInt();
        int array [][] = new int[row][column];
        System.out.println("Enter the elements of the matrix with a space between each number (Ex. 4 6 8 5 8 9 2 1 8):");

        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                array[i][j] = my_scanner.nextInt();
            }
        }
        System.out.println("Input:");
        initialMatrix(row,column,array);
        System.out.println("Output:");
        transpose(row,column,array);

    }
}
