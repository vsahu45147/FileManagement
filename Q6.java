package FileManagement;
import java.io.File;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the name of the file to be deleted
        System.out.println("Enter the name of the file to be deleted:");
        String fileName = scanner.nextLine();

        // Create a File object for the specified file
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            // Delete the file
            boolean isDeleted = file.delete();
            if (isDeleted) {
                System.out.println("File '" + fileName + "' has been successfully deleted.");
            } else {
                System.out.println("Failed to delete the file '" + fileName + "'.");
            }
        } else {
            System.out.println("The file '" + fileName + "' does not exist.");
        }

        scanner.close();
    }
}
