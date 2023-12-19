/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		var a = Integer.parseInt(args[0]);
		var b = Integer.parseInt(args[1]);
		var c = Integer.parseInt(args[2]);
		boolean result = a + b > c && a + c > b && c + b > a;
        System.out.printf("%d, %d, %d: %b", a,b,c,result);
	}
}
