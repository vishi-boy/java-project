package mycode;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytesToFileDemo {
    public static void main(String[] args) {
        System.out.println("The program is done by Vishal gupta, roll no 118");
        // Use try-with-resources to ensure the FileOutputStream is closed automatically
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.bin")) {
            byte[] bytesToWrite = {65, 66, 67, 68, 69}; // Corresponds to 'A', 'B', 'C', 'D', 'E'
            fileOutputStream.write(bytesToWrite);
            System.out.println("Bytes written to output.bin successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
