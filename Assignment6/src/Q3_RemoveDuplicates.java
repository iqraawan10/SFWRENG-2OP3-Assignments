/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.Scanner;

public class Q3_RemoveDuplicates {
    private static Scanner my_scanner;

    public static void sort (int[] array){
        int len = array.length;
        int temp = 0;

        for (int i =0; i<len; i++){
            for (int j = 1; j<(len-i); j++){
                if (array[j-1] < array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static int removeDuplicate(int[] input, int len){
        if (len == 0| len == 1){
            return len;
        }
        int [] temp = new int[len];
        int j = 0;
        for (int i = 0; i<len-1; i++){
            if(input[i] != input[i+1]){
                temp [j++] = input[i];
            }
        }
        temp[j++] = input[len-1];
        for (int i=1; i<j; i++){
            input[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        my_scanner = new Scanner(System.in);

        System.out.println("Enter length of array (ie. how many elements in array) (Ex.10):");
        int N = my_scanner.nextInt();
        System.out.println("Enter an array with spaces between each number (Ex.0 1 1 0 1 2 2 3 3 4):");
        int [] array = new int[N];
        int length = array.length;

        for (int i =0; i <array.length; i++){
            array[i] = my_scanner.nextInt();
        }
        sort(array);
        length = removeDuplicate(array,length);

        System.out.print("Output: \n");
        for (int i = 0; i<length; i++){
            System.out.println(array[i] + "  ");
        }
    }
}
