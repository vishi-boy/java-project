package mycode;
import java.util.Scanner;
import mypackage.userd;
public class result {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("The program is done by Vishal Gupta");
		System.out.println("Enter the numbers: ");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int result=userd.add(a, b);
		System.out.println("Result: "+result);
		sc.close();
	}
}
