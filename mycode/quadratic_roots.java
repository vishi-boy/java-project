package mycode;
import java.util.Scanner;
public class quadratic_roots {
	public static void main(String[] args) {
		System.out.println("This assignment is done by Vishal gupta, roll no 118");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		double determinant = b*b - 4*a*c;
		if (determinant>0) {
			double root1 = (-b + Math.sqrt(determinant))/(2*a);
			double root2 = (-b + Math.sqrt(determinant))/(2*a);
			System.out.format("Root 1 = %.2f%n", root1);
			System.out.format("Root 2 = %.2f%n", root2);
		}
		else if(determinant == 0) {
			double root = -b / (2*a);
			System.out.format("Both roots are equal: %.2f%n", root);
		}
		else {
			double realPart = -b /(2*a);
			double imaginaryPart = Math.sqrt(-determinant)/(2*a);
			System.out.format("Root 1 = %.2f + %.2fi%n" ,realPart,imaginaryPart);
			System.out.format("Root 2 = %.2f - %.2fi%n" ,realPart,imaginaryPart);
		}
	}
}
