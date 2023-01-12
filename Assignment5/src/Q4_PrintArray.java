/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a java program to use Method Overloading for printing three types of array:
 * Integer[], Character[] and Double[].
 *
 * Input: None.
 * Output: print out different types of array.
 *
 * There is no specific format as long as printed arrays are neatly and cleanly.
 *
 */
import java.util.Arrays;
public class Q4_PrintArray {
    // creating a method for printing integer array
    static Integer[] Array(Integer[] i_array) {
        System.out.println(Arrays.toString(i_array));
        return i_array;
    }

    // overloading the above created method with different parameter method
    // contains a character parameter
    static Character [] Array(Character[] c_array){
        System.out.println(Arrays.toString(c_array));
        return c_array;
    }

    // overloading the above created method with different parameter method
    // contains a double parameter
    static Double [] Array(Double[] d_array){
        System.out.println(Arrays.toString(d_array));
        return d_array;
    }

    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4,5};
        Character[] carr = {'A','B','C','D','E'};
        Double[] darr = {1.234, 2.345, 3.456, 4.567};

        // calling the methods and printing the arrays
        Array(iarr);
        Array(carr);
        Array(darr);
    }
}
