// Import some classes
import java.util.Scanner; // Use bufferedWriter instead
import java.io.BufferedWriter; // Use StringBuilder instead
import java.lang.StringBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle {

    Scanner scannerObject() {
        return new Scanner(System.in);
    }

    String fileCreation() {
        //var truth = true
        String path = "textfile"; // Name of file
        try {
            File myObj = new File(path); // Create a File
            // Then do a check
            if (myObj.createNewFile()) {
                System.out.println("The file was created successfully.");
            }
            else {
                System.out.println("File exists from before.");
            }
        }
        catch (IOException exception) {
            System.out.println("Error when creating file:");
            exception.printStackTrace();
        }
        return path;
    }
    // New approach to writeFile():
    void writeFile(String a) {
        System.out.println(a);
        try {
            FileWriter writerObj = new FileWriter(a);
            StringBuilder holdString = new StringBuilder();
            System.out.println("Enter text repeatedly that will be appended to file. " +
                    "Type 'done' to exit when you want to finish." + "\n" + "Enter input..");
            // Something is needed here to store user input
            String input;
            Scanner myScanner = scannerObject();
            while(!(input = myScanner.nextLine()).equalsIgnoreCase("done")){
                writerObj.write(input);
            }
            //writerObj.write(myScanner);
            writerObj.close();
            System.out.println("Wrote to file.");
        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    }
    /* Old approach
    void writeFile(String a) {
        try {
            FileWriter writerObj = new FileWriter(a);
            Scanner myScanner = scannerObject();
            writerObj.write(myScanner.nextLine());
            writerObj.write(myScanner);
            writerObj.close();
            System.out.println("Wrote to file.");
        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    } */
}
