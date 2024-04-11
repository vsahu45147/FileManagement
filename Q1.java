package FileManagement;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a diary entry
        System.out.println("Enter your diary entry:");
        String diaryEntry = scanner.nextLine();

        // Create a SimpleDateFormat object to format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());

        // Check if the file already exists
        File file = new File("diary.txt");
        if (file.exists()) {
            System.out.println("The file 'diary.txt' already exists. Appending the entry to the existing file.");
        } else {
            System.out.println("Creating a new file 'diary.txt'.");
        }

        // Write the date and diary entry to the file
        try {
            FileWriter writer = new FileWriter("diary.txt", true); // true for appending
            writer.write("\nDate: " + currentDate + "\n");
            writer.write(diaryEntry + "\n");
            writer.close();
            System.out.println("Diary entry has been successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}
