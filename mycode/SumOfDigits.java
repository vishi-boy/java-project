package mycode;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program is done by Vishal gupta");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = getSumOfDigits(number);
        System.out.println("Sum of digits of the number: " + sum);
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;

        // Iterate through each digit of the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; 
        }

        return sum;
    }
}
