/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
    public static void main(String[] args) {
        var firstNumber = Integer.parseInt(args[0]);
        var secondNumber = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
    }
}
