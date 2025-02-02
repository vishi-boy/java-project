package mycode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "sourceFile.txt";
        String destinationFile = "destinationFile.txt";

        // Use try-with-resources to ensure streams are closed properly
        try (
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read bytes from the source file and write to the destination file
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            // Print the error message if an exception occurs
            System.err.println("Error: " + e.getMessage());
        }
    }
}
