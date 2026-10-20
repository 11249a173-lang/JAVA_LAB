import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            // Create a file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Welcome to Java File Operations.\n");
            writer.write("This is a sample file.");
            writer.close();
            System.out.println("Data written successfully.");

            // Append data to the file
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nFile operations are easy in Java.");
            appendWriter.close();
            System.out.println("Data appended successfully.");

            // Read data from the file
            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;
            System.out.println("\nFile contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}