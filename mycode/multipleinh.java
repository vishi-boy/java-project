package mycode;
interface swimmable{
	void swim();
}
interface walkable{
	void walk();
}
class duck implements swimmable,walkable{
	public void swim() {
		System.out.println("Duck is swimming");
	}
	public void walk() {
		System.out.println("Duck is walking");
	}
}
public class multipleinh {
	public static void main(String[] args) {
		System.out.println("The program is done by vishal gupta, roll no 118");
		duck d=new duck();
		d.walk();
		d.swim();
	}
}
