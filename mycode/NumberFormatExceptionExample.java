package mycode;
import java.util.Scanner;
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program is done by Vishal Gupta");
        try {
            System.out.print("Enter an integer: ");
            String userInput = scanner.nextLine();
            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        finally {
            scanner.close();
        }
    }
}