package FileManagement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the source file path
        System.out.println("Enter the source file path:");
        String sourcePath = scanner.nextLine();

        // Prompt the user for the destination file path
        System.out.println("Enter the destination file path:");
        String destinationPath = scanner.nextLine();

        // Create File objects for source and destination files
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        // Check if the source file exists
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Source file does not exist or is not a file.");
            return;
        }

        // Check if the destination file exists
        if (destinationFile.exists()) {
            // If the destination file exists, prompt for confirmation before overwriting
            System.out.println("Destination file already exists. Do you want to overwrite it? (yes/no)");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("Operation cancelled by user.");
                return;
            }
        }

        // Perform the copy operation
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
