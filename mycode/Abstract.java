package mycode;
abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public abstract void drive();
    public abstract void stop();
}
class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }
    public void drive() {
        System.out.println("Car is driving.");
    }
    public void stop() {
        System.out.println("Car has stopped.");
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }
    public void drive() {
        System.out.println("Motorcycle is driving.");
    }
    public void stop() {
        System.out.println("Motorcycle has stopped.");
    }
}
public class Abstract {
	public static void main(String[] args) {
		System.out.println("The program is done by vishal gupta, roll no 118");
        Car car = new Car("Toyota", "Camry", 2020);
        car.drive();
        car.stop();
        System.out.println();
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021);
        motorcycle.drive();
        motorcycle.stop();
    }
}
