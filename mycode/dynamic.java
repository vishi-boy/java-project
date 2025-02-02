package mycode;
class Animal{
	void makesound() {
		System.out.println("Animal makes a sound");
	}
}
class dog extends Animal{
	void makesound() {
		System.out.println("Dog barks");
	}
}
class cat extends Animal{
	void makesound() {
		System.out.println("Cat meows");
	}
}

public class dynamic {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta");
		Animal animal1=new Animal();
		Animal animal2=new dog();
		Animal animal3=new cat();
		animal1.makesound();
		animal2.makesound();
		animal3.makesound();
	}
}
