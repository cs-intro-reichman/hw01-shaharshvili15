/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        Random rand = new Random();
        int firstRandom = rand.nextInt(min, max);
        int minNumber = firstRandom;
        System.out.println(firstRandom);
        for (int i = 0; i < 2; i++) {
            int random = rand.nextInt(min, max);
            System.out.println(random);
            //Check if the new random number is less then the current minimum
            if (random < minNumber) {
                minNumber = random;
            }
        }
        System.out.printf("The minimal generated number was %d", minNumber);

    }
}
