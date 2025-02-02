package mycode;
class V{
	int maxspeed=120;
}
class c extends V{
	int maxspeed=150;
	void show() {
		System.out.println("Maximum Speed: "+super.maxspeed+"\nIt shows the use of super keyword");
	}
}
public class keyword{
	static void m1() {
		System.out.println("\nStatic Keyword\nIt shows the use of static keyword");
	}
	public static void main(String[] args) {
		System.out.println("The program is done by vishal gupta, roll no 118");
		c ca=new c();
		ca.show();
		m1();
		final double pi=3.14159;
		System.out.println("\nThe final keyword is used to show the value of pi which is: "+pi);
	}
}
