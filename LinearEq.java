/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
    public static void main(String[] args) {
        var a = Double.parseDouble(args[0]);
        var b = Double.parseDouble(args[1]);
        var c = Double.parseDouble(args[2]);
        var x = (c - b) / a;
        System.out.printf("%f * x + %f = %f", a,b,c);
        System.out.println();
        System.out.printf("x = %f", x);
    }
}