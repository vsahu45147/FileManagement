package FileManagement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Open the "diary.txt" file
        File file = new File("diary.txt");

        try {
            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(file);

            // Read and display the content of the file
            System.out.println("Contents of 'diary.txt':");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            // Close the Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle case where the file does not exist
            System.out.println("The file 'diary.txt' does not exist.");
        }
    }
}

