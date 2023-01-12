/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.util.Scanner;

public class Q1_FindMinimum {

    private static Scanner my_scanner;

    public static void Min_Val (int [] array, int N) throws ArrayIndexOutOfBoundsException{
        array = new int[N];

        for (int i = 0; i < N; i++) {
            array [i] = my_scanner.nextInt(); 
        }
        if (N > array.length){
            throw new ArrayIndexOutOfBoundsException("N is not in range of input array");
        }
        int min_val = array[0];
        for (int i = 0; i < array.length; i ++) {
            if (array[i] < min_val) {
                min_val = array[i];
            }

        }
        System.out.println("Min is:"+ min_val);

    }
    public static void main(String[] args) {
        my_scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int N = my_scanner.nextInt();

        System.out.println("Please enter an array and add spaces between each number:");
        int myArray[] = new int[N];

        try{
            Min_Val(myArray, N);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("N is not in range of input array");
        }


    }
}




