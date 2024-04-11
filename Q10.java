package FileManagement;

import java.io.File;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the directory path
        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        // Display directory listing recursively
        System.out.println("Contents of " + directoryPath + ":");
        listContents(directory, 0);

        scanner.close();
    }

    // Recursive method to list directory contents
    private static void listContents(File directory, int depth) {
        // Indentation for nested files/directories
        String indentation = " ".repeat(depth * 4);

        // List files and directories in the current directory
        File[] filesAndDirs = directory.listFiles();
        if (filesAndDirs != null) {
            for (File fileOrDir : filesAndDirs) {
                System.out.println(indentation + fileOrDir.getName());
                if (fileOrDir.isDirectory()) {
                    // Recursively list contents of subdirectory
                    listContents(fileOrDir, depth + 1);
                }
            }
        }
    }
}
