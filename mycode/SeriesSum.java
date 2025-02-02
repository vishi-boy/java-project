package mycode;
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program is done by Vishal gupta");

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the first term of the series: ");
        int firstTerm = scanner.nextInt();

        System.out.print("Enter the common difference: ");
        int commonDifference = scanner.nextInt();

        int sum = getSumOfSeries(n, firstTerm, commonDifference);
        System.out.println("Sum of the first " + n + " terms in the series: " + sum);
    }

    public static int getSumOfSeries(int n, int firstTerm, int commonDifference) {
        
        return (n / 2) * (2 * firstTerm + (n - 1) * commonDifference);
    }
}
