import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int wordCount = 0;

        try {
            // Step 1: Read the file
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split("\\s+"); // Split line into words
                wordCount += words.length;
            }
            sc.close();

            // Step 2: Write result to output file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Total words in input.txt: " + wordCount);
            writer.close();

            System.out.println("Word count completed. Check output.txt!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
