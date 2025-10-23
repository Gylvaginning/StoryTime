// Import some classes
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {
    boolean fileCreation() {
        var truth = true;
        try {
            File myObj = new File("textfile"); // Create a File
            // Then do a check
            if (myObj.createNewFile()) {
                System.out.println("The file was created successfully.");
            }
            else {
                System.out.println("File exists from before.");
                truth = false;
            }
        }
        catch (IOException exception) {
            System.out.println("Error when creating file:");
            exception.printStackTrace();
        }
        return truth;
    }
    void writeFile() {
        try {
            FileWriter writerObj = new FileWriter("textfile.txt");
            Scanner myScanner = scannerObject();
            writerObj.write(myScanner.nextLine());
            writerObj.close();
            System.out.println("Wrote to file.");
        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    }
    Scanner scannerObject() {
        return new Scanner(System.in);
        }
}
