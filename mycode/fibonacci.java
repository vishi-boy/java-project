package mycode;

public class fibonacci {
	
	    public static void main(String[] args) {
	        int n = 10; // Number of Fibonacci numbers to print
	        int first = 0, second = 1;
	        System.out.println("This program is solved by vishal gupta ,roll no 118");
	        System.out.println("First " + n + " numbers in Fibonacci series:");
	        System.out.print(first + " " + second + " ");
	        
	        
	        for (int i = 2; i < n; i++) {
	            int next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	        }
	    }

}