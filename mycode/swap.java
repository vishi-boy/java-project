package mycode;
import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Numbers before swapping");
		System.out.println(a+"\n"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swapping");
		System.out.println(a+"\n"+b);
	}
}
