package filesandIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PracticeFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("students.txt");
        if(Files.exists(path)) {
            System.out.println("File exists");
        } else {
            Files.createFile(path);
            System.out.println("File created");
        }
    }
}
