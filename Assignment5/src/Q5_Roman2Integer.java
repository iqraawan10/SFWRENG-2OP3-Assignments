/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.Scanner;
public class Q5_Roman2Integer {

    private static Scanner my_scanner;

    public static void Conversion(String roman) {

        int length = roman.length();

        int value = 0;
        roman = roman + " ";
        for (int i = 0; i < length; i++) {
            char symbol = roman.charAt(i);
            char symbol2 = roman.charAt(i + 1);

            //written from largest to smallest
            if (symbol == 'M') {
                value = value + 1000;
            }
            else if (symbol == 'D') {
                value = value + 500;
            }
            else if (symbol == 'C') {
                if (symbol2 == 'M') {
                    value = value + 900;
                    i++;
                }
                else if (symbol2 == 'D') {
                    value = value + 400;
                    i++;
                }
                else {
                    value = value + 100; //symbol C
                }
            }
            else if (symbol == 'L') {
                value = value + 50;
            }
            else if (symbol == 'X') {
                if (symbol2 == 'C') {
                    value = value + 90;
                    i++;
                }
                else if (symbol2 == 'L') {
                    value = value + 40;
                    i++;
                }
                else {
                    value = value + 10;// Symbol X
                }
            }
            else if (symbol == 'I') {
                if (symbol2 == 'X') {
                    value = value + 9;
                    i++;
                }
                else if (symbol2 == 'V') {
                    value = value + 4;
                    i++;
                }
                else {
                    value++;
                }
            } else {
                value = value + 5; // symbol V
            }
        }
        System.out.println("Roman Value:"+ roman);
        System.out.println("Integer Value:"+value);
    }

    public static void main(String[] args){
        my_scanner = new Scanner(System.in);
        System.out.println("Please enter a roman numeral:");
        String roman = my_scanner.nextLine();

        Conversion(roman);
    }
}
