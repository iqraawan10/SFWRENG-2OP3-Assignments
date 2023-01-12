/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)

Many companies use telephone numbers like 555-GET-Food so the number is easier for their customers to remember.
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:

A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
The application should display the telephone number with any alphabetic characters that appeared in the original
translated to their numeric equivalent.

Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number = 0; // 'number' is the digital phone number to compute from the initial alphabetic phone number.



        for (int i = 0; i < 10; i++){
            char letter = initial_phone_number.charAt(i);

            if (letter == 'A' || letter == 'B' || letter == 'C') {
                number = number*10;
                number = number + 2;
            }
            else if (letter == 'D' || letter == 'E' || letter == 'F') {
                number = number*10;
                number = number + 3;
            }
            else if (letter == 'G' || letter == 'H' || letter == 'I'){
                number = number*10;
                number = number + 4;
            }
            else if (letter == 'J' || letter == 'K' || letter == 'L'){
                number = number*10;
                number = number + 5;
            }
            else if ( letter == 'M' || letter == 'N' || letter == 'O'){
                number = number*10;
                number = number + 6;
            }
            else if ( letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S'){
                number = number*10;
                number = number + 7;
            }
            else if ( letter == 'T' || letter == 'U' || letter == 'V') {
                number = number*10;
                number = number + 8;
            }
            else if ( letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
                number = number*10;
                number = number + 9;
            }
            else {
                number = number*10;
                number = number + Character.getNumericValue(letter);
            }


        }



        // Return actual number only at the end of the function
        return number;

    }// End of full_number function
}
