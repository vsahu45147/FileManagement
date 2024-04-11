package FileManagement;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
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
            // List all files and subdirectories in the directory
            System.out.println("Files and subdirectories in " + directoryPath + ":");
            File[] filesAndDirs = directory.listFiles();
            if (filesAndDirs != null) {
                Arrays.stream(filesAndDirs).forEach(file -> System.out.println(file.getName()));
            }
        }

        scanner.close();
    }
}

