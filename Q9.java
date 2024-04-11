package FileManagement;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the file name
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        // Create a File object for the specified file
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not a file.");
            return;
        }

        // Display file metadata
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + formatDate(file.lastModified()));

        scanner.close();
    }

    // Method to format date
    private static String formatDate(long milliseconds) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date(milliseconds));
    }
}
