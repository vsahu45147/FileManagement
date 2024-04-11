package FileManagement;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a new diary entry
        System.out.println("Enter your new diary entry:");
        String newEntry = scanner.nextLine();

        // Get the current timestamp
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());

        // Append the new entry along with the timestamp to the file
        try {
            FileWriter writer = new FileWriter("diary.txt", true); // true for appending
            writer.write("\nDate: " + timestamp + "\n");
            writer.write(newEntry + "\n");
            writer.close();
            System.out.println("New diary entry has been successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }

        scanner.close();
    }
}
