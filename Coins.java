/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
    public static void main(String[] args) {
        var numberOfCents = Integer.parseInt(args[0]);
        var numberOfQuartersCoins = numberOfCents / 25;
        var numberOfCentsCoins = numberOfCents % 25;
        System.out.printf("Use %d quarters and %d cents", numberOfQuartersCoins, numberOfCentsCoins);
    }
}