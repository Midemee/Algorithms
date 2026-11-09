package filesandIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Stream;

public class FileStreamSample {
    public static void main(String[] args) {
        String fileLocation = "/home/aramide/Documents/files/first_issue.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation);){
            byte[] fileContent = fileInputStream.readAllBytes();
            System.out.println(new String(fileContent));

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
