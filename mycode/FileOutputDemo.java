package mycode;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {
        System.out.println("The program is done by Vishal gupta");
        
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
             PrintStream printStream = new PrintStream(fileOutputStream)) {
             

            printStream.println("Hello, world!");
            printStream.println("This is a demonstration of FileOutputStream and PrintStream.");
            printStream.println("Feel free to add more content!");
            
           
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {            
            System.out.println("Error: " + e.getMessage());
        }
    }
}
