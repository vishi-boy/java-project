package mycode;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program is done by Vishal gupta");
        System.out.print("Enter the maximum prime number: ");
        int maxNumber = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + maxNumber + ":");
        for (int i = 2; i <= maxNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                scanner.close();
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}