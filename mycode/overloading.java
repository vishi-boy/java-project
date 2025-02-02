package mycode;
class Box {
    double width;
    double height;
    double depth;

    // Constructor with no parameters
    Box() {
        width = 1;
        height = 1;
        depth = 1;
    }

    // Constructor with one parameter (for creating a cube)
    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate and return the volume of the box
    double volume() {
        return width * height * depth;
    }
}

public class overloading {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Box box1 = new Box(); // Default constructor
        Box box2 = new Box(5); // Constructor with one parameter
        Box box3 = new Box(3, 4, 6); // Constructor with three parameters

        // Displaying volumes of the boxes
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}