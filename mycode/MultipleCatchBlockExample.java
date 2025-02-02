package mycode;

public class MultipleCatchBlockExample {
    public static void main(String[] args) {
        System.out.println("The program is done by Vishal Gupta");
        try {
            int[] a = new int[5];
            // Corrected the index to 4 as array indexes start from 0
            a[4] = 30 / 0; // Also corrected division by zero error
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } 
        catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Rest of the code");
    }
}
