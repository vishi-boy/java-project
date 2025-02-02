package mycode;
import java.util.Scanner;
public class bigthree {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta");
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter the numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if((num1>num3)&&(num1>num2)) {
			System.out.println(num1+" is largest");
		}
		else if((num2>num1)&&(num2>num3)) {
			System.out.println(num2+" is largest");
		}
		else if((num3>num1)&&(num3>num2)) {
			System.out.println(num3+" is largest");
		}
		else {
			System.out.println("Conditions are not satisfied");
		}
	}
}

