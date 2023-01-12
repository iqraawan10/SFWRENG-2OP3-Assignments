/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (30 marks)

Write a program that generates a random number y and asks the user to guess what the number is.
If the user's guess x is higher than y,the program should display "The number is lower than x." and asks the user to guess again.
If the user's guess x is lower than y, the program should display "The number is higher than x." and asks the user to guess again.
If the user exceed a certain times of trails (i.e., 10 times), then the program should display "You have exhausted your trials" and stop.
If the user successfully guess the number, then the program should display "You successfully guessed the number!".
 */

import java.util.Scanner;

public class Q4_GuessNumberGame {

    // Function that implements the number guessing game
    public static void guessingNumberGame(int number_to_guess, int number_of_trials) {
        boolean correct_ans = false;
        int max_trials = 11;
        number_of_trials = 0;

        while (!correct_ans && ++number_of_trials<max_trials) {
            Scanner my_scanner = new Scanner(System.in);
            System.out.println("Guess a number:");
            int guess = my_scanner.nextInt();
            if (guess > number_to_guess) {
                System.out.println("The number is lower than " + guess);
            } else if (guess < number_to_guess) {
                System.out.println("The number is higher than " + guess);
            } else {
                System.out.println("You successfully guessed the number!");
                correct_ans = true;
            }
        }
        if (number_of_trials == max_trials){
            System.out.println("You have exhausted your trials");
            }
        }


    public static void main(String arg[]) {
        // Generate the numbers
        int number_to_guess = 1 + (int)(50 * Math.random()); // the random number y to guess
        int number_of_trials = 10; // the total times of trials

        // start guessing
        guessingNumberGame(number_to_guess, number_of_trials);
    }
}