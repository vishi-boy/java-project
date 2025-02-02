package mycode;
public class student {
    int id;
    String name;
    student() {
        System.out.println("This is a default constructor");
    }
    student(int i, String n) {
        id = i;
        name = n;
    }


public static void main(String[] args) {
	System.out.println("The program is done by Vishal gupta");
    student s = new student();
    System.out.println("\nDefault Constructor values:\n");
    System.out.println("Student Id: " + s.id + "\nStudent Name: " + s.name);

    System.out.println("\nParameterized Constructor values:\n");
    student student = new student(10, "David");
    System.out.println("Student Id: " + student.id + "\nStudent Name: " + student.name);
    }
}
