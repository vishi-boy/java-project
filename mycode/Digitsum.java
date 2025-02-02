package mycode;
import java.util.Scanner;
public class Digitsum {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta");
		Scanner sc=new Scanner(System.in);
		int n,sum=0,rem;
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sum: "+sum);
	}
}
