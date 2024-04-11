package FileManagement;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a directory path
        System.out.println("Enter a directory path:");
        String directoryPath = scanner.nextLine();

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
        } else {
            // List all ".txt" files in the directory
            File[] txtFiles = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
            if (txtFiles != null && txtFiles.length > 0) {
                System.out.println("Text files in " + directoryPath + ":");
                Arrays.stream(txtFiles).forEach(file -> System.out.println(file.getName()));
            } else {
                System.out.println("No text files found in the specified directory.");
            }
        }

        scanner.close();
    }
}
