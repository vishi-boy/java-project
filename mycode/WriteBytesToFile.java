package mycode;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytesToFile {
    public static void main(String[] args) {
    	 System.out.println("The program is done by Vishal gupta");
        String fileName = "output.bin";

        // Define the bytes to write
        byte[] bytesToWrite = {65, 66, 67, 68, 69}; // Corresponds to 'A', 'B', 'C', 'D', 'E'

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            // Write the bytes to the file
            fileOutputStream.write(bytesToWrite);
            System.out.println("Bytes written to " + fileName + " successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
