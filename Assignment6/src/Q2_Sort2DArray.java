/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Write a java program, use "subroutine" to finish sorting a 2-dimension array.
 *
 * User input a 2-dimension array of double type, return it in non-decreasing
 * order according to values in the first raw, if there are two or more same
 * element in the first raw, keep the original sequence.
 *
 * INPUT: a user input 2-dimension array.
 * OUTPUT: sorted input array in non-decreasing order according to values in the first raw.
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example 1
 * INPUT: if user input array (Order 2*4) is
 *        1.45  0.25  8.95  0.99
 *        2.56  5.67  0.47  2.65
 *
 * OUTPUT: 0.25  0.99  1.45  8.95
 *         5.67  2.65  2.56  0.47
 *
 * Example 2
 * INPUT: if user input array (Order 5*5) is
 *        0.95  0.23  0.95  0.95  0.65
 *        2.56  5.67  0.47  2.65  0.47
 *        1.45  0.25  8.95  0.99  0.67
 *        5.67  2.65  0.25  8.95  0.99
 *        1.23  4.21  0.97  7.64  8.52
 *
 * OUTPUT: 0.23  0.65  0.95  0.95  0.95
 *         5.67  0.47  2.56  0.47  2.65
 *         0.25  0.67  1.45  8.95  0.99
 *         2.65  0.99  5.67  0.25  8.95
 *         4.21  8.52  1.23  0.97  7.64
 *
 */

import java.util.Scanner;

public class Q2_Sort2DArray {
    private static Scanner my_scanner;

    public static void sortArray(double[][] array){
        for(int i =0; i<array.length; i++){
            for(int j=1; j<array[i].length;j++){
                if(i != 0){
                    for (int k = j; k>0; k--){
                        if (array[i][k-1] < array[i][k]){
                            double temp = array[i][k-1];
                            array[i][k-1] = array[i][k];
                            array[i][k] = temp;
                            double temp1 = array[i-1][k-1];
                            array[i-1][k-1] = array[i-1][k];
                            array[i-1][k] = temp1;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        my_scanner = new Scanner(System.in);

        System.out.println("Enter number of rows (Ex.2):");
        int row = my_scanner.nextInt();
        System.out.println("Enter number of columns (Ex. 4):");
        int column = my_scanner.nextInt();
        double array[][] = new double[row][column];

        System.out.println("Enter the elements of the matrix with a space between each number (Ex. 1.45 0.25 8.95 0.99 2.56 5.67 0.47 2.65):");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = my_scanner.nextDouble();
            }
        }
        sortArray(array);
        System.out.print("Output: \n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "   ");
            System.out.println();
        }
    }
}
