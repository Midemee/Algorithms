package filesandIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HorizonsFileCreator {

    public static void main(String[] args) {

        try{
            String fileLocation = "/home/praise/IdeaProjects/Project/src/Files/File";
            Path path = Path.of(fileLocation);
            Files.write(path, "My name is Praise".getBytes());
        } catch(IOException ex) {
            ex.printStackTrace();
            System.err.println(ex.getMessage());
        }

//        Use a method of class file to work with the path
    }
}

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//public class FileCreator {
//    public static void main(String[] args) {
//        try {
//            String fileLocation = "/home/gamp/Desktop/google.txt";
//            Path path = Path.of(fileLocation);
//            Files.write(path, "Arsenal go too cry".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.err.println(e.getMessage());
//        }
//    }
//}

// call the end points
//posts.json
//post.json
//comments.json
//comment.jsom