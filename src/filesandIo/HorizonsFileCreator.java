package filesandIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HorizonsFileCreator {

    public static void main(String[] args) {
        try {
            String fileLocation = "/home/aramide/Documents/files/mide.txt";
            Path path = Path.of(fileLocation);
            Files.write(path, "Arsenal go too cry".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}

