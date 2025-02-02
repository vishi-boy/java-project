package mycode;
import java.util.Scanner;
class Shape{
	int length,breadth;
	Shape(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
}
class Rectangle extends Shape{
	Rectangle(int length,int breadth){
		super(length,breadth);
	}
	int calArea() {
		return length*breadth;
	}
}
public class Inheritance {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Rectangle r=new Rectangle(length,breadth);
		int area=r.calArea();
		System.out.println("Area of rectangle: "+area);
	}
}
