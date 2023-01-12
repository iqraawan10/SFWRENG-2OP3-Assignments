/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */

import java.util.Scanner;

public class Q1_TwoSum {
    private static Scanner my_scanner;

    public static int[] returnIndices(int target, int[] array){
        for (int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        my_scanner = new Scanner(System.in);

        System.out.println("Enter length of array (ie.how many elements in array) (Ex. 4):");
        int N = my_scanner.nextInt();
        System.out.println("Enter an array and add spaces between each number (Ex. 2 7 11 15):");
        int[] array = new int[N];

        for (int i=0; i<N; i++){
            array[i]=my_scanner.nextInt();
        }
        System.out.println("Choose a number for the target number (Ex. 9):");
        int target = my_scanner.nextInt();

        int [] indices = returnIndices(target,array);

        if (indices.length == 2){
            System.out.println(indices[0]+" "+indices[1]);
        }
        else{
            System.out.println("Solution not found");
        }
    }

}
