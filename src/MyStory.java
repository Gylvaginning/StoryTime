// Import classes
import java.io.File;

public class MyStory {
    // A method responsible for retrieving stories chosen.
    static void story1() {
        var x = 1;
        System.out.println(x);
    }

    static String newMethod() {
        return "A string";
    }
    // All fun and games up until now. Let us try and add some fun stuff.
    // Such as for example:
    /*
        Practice Java File Handling, Java I/O Streams
        1) Make a CreateFile class and make an object from this class which performs step 2)
        .... <><>
        2) Create a file and write (dynamically?) a short story to it
        Practice Java String manipulation
        2) Read each word from the file as an Array and replace every
         occurrence of the letter "o" with "0"
    */


    /* The "driver" file of the directory, this file will be
     responsible for the program execution.
     */
    public static void main(String[] args) {
        // Create a MyStory object:
        //MyStory storyContainer = new MyStory();
        // Where my program is run.
        //story1();
        //System.out.println(newMethod());
        /*
        Let us do some fun stuff.
         */
        FileHandle FileObject = new FileHandle(); // Make an object of the FileHandle class named FileObject
        String filename = FileObject.fileCreation(); // The returned String variable of the fileCreation() method is put into the variable filename
        System.out.println(filename);
        FileObject.writeFile(filename);
    }
}