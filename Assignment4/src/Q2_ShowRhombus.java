/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. (see the following example)
 * Your subroutine should directly print the result and do not return anything.

*
* Example:
* For n=7, the rhombus structure is:
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1

* For n=3, the rhombus structure is:
  1
 212
32123
 212
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombus {
    private static Scanner my_scanner;

    public static void rhombus1 (int n) {
        int num_spaces = 1, count = 1, start = 0;

        for (int i =1; i < (n*2); i++){
            for (int x = n - num_spaces; x > 0; x--){
                System.out.print(" ");
            }
            if (i < n) {
                start = i;
                num_spaces++;
            }
            else {
                start = n*2-i;
                num_spaces--;
            }
            for (int j = 0; j < count; j++){
                System.out.print(start);
                if (j < count/2) {
                    start--;
                }
                else {
                    start++;
                }
            }
            if (i < n) {
                count = count +2;
            }
            else {
                count = count - 2;
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        my_scanner = new Scanner(System.in);
        System.out.println("Input value of n:");
        int n = my_scanner.nextInt();

        rhombus1(n);
    }
}
