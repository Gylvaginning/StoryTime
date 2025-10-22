// Import some classes
import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void fileCreation() {
        try {
            File myObj = new File("textfile.txt"); // Create a File
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
    }
}
