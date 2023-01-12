/* Assignment 8 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (40 marks)
    Use java to implement a class Dice, a class Gambler and a method that continue gambling between two gamblers until one
    gambler cannot afford the stake.

 */

// the class of Dice to play
import java.util.Random;
class Dice {
    private int num_faces;

    Dice(){
        num_faces=6; // standard dice with 6 faces by default.
    }

    // implement the roll dice method that roll the dice once and return the value of the roll.
    // (5 marks)
    public int rollDice() {
        Random roll = new Random();
        int rolled = roll.nextInt(num_faces-1);
        return rolled + 1;
    }
}

// the class of gambler
class Gambler {
    public int money;
    public Dice die;

    Gambler(int initial_money) {
        money = initial_money;
        die = new Dice();
    }

    // use static method to implement the gambling activity.
    // In a gambling activity, two gamblers gamble on a stake.
    // Each gambler rolls a die, the gambler who roles a larger value wins the stake.
    // if it is a due, then roll again, until there is a winner.
    // Note: a gambler cannot start gamble if he does not have more money than the amount of stake.
    // Note: return false if at least one gambler cannot afford the stake. Otherwise, return true.
    // Note: print the result of rolled dice values, and the winner of the gambling.
    // (20 marks)
    static boolean gambling(Gambler gambler_1, Gambler gambler_2, int stake) {

        if (gambler_1.money < stake){
            System.out.printf("Gambler 1 cannot afford to pay. The stake is %d and gambler 1 has %d dollars\n", stake, gambler_1.money);
            return false;
        }
        else if(gambler_2.money < stake){
            System.out.printf("Gambler 2 cannot afford to pay.The stake is %d and gambler 2 has %d dollars\n", stake, gambler_2.money);
            return false;
        }
        boolean due = true;
        while(due){
            int roll1 = gambler_1.die.rollDice();
            int roll2 = gambler_2.die.rollDice();
            if(roll1 > roll2){
                gambler_1.money += stake;
                gambler_2.money -= stake;
                System.out.printf("Gambler 1 rolled %d and gambler 2 rolled a %d\n", roll1, roll2);
                System.out.println("Gambler 1 won!");
                due = false;
            }
            else if (roll1 < roll2){
                gambler_1.money -= stake;
                gambler_2.money += stake;
                System.out.printf("Gambler 1 rolled a %d and gambler 2 rolled a %d\n", roll1, roll2);
                System.out.println("Gambler 2 won!");
                due = false;
            }
            else{
                System.out.printf("Gambler 1 and gambler 2 rolled the same number which was a %d\n", roll1);
            }
        }
        return true;
    }
}

public class Q1_DiceGambling {

    // Continue Gambling until one gambler cannot afford the stake
    // Print the amount of money of each gambler after each round of gambling.
    // Print the value of rolled dice for each gambler in each round of gambling.
    // (15 marks)
    public static void keepGambling(Gambler gambler_1, Gambler gambler_2, int stake, int max_gambling_times) {
        int gambling_times = 0;
        while (gambling_times < max_gambling_times){
            boolean game = Gambler.gambling(gambler_1,gambler_2,stake);
            gambling_times++;
            if(!game){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int initial_money = 10;
        int stake = 5;
        int max_gambling_times = 10;

        Gambler gambler1 = new Gambler(initial_money);
        Gambler gambler2 = new Gambler(initial_money);

        keepGambling(gambler1, gambler2, stake, max_gambling_times);

    }
}
