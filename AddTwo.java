/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
    public static void main(String[] args) {
        var first = Integer.parseInt(args[0]);
        var second = Integer.parseInt(args[1]);
        System.out.printf("%d+%d=%d%n", first, second, first + second);
    }
}
