package mycode;
public class BoxVolume {
    public static void main(String[] args) {
    	System.out.println("this box volume program is solved by somya jain , roll no 098");
        Box myBox = new Box();

        double volume1 = myBox.volume(10, 20, 30);
        double volume2 = myBox.volume(10, 20);
        double volume3 = myBox.volume(10);

        System.out.println("Volume with three parameters (10, 20, 30): " + volume1 + " cubic units");
        System.out.println("Volume with two parameters (10, 20), assuming height = 1: " + volume2 + " cubic units");
        System.out.println("Volume with one parameter (10), assuming cube: " + volume3 + " cubic units");
    }
}

class Box {
        double volume(double length, double width, double height) {
        return length * width * height;
    }

   
    double volume(double length, double width) {
        return length * width * 1; 
    }


    double volume(double length) {
    	return length * length * length
    }
}