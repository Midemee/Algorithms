package filesandIo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String videoUrl = "add link to video";
        URI uri = URI.create(videoUrl);
        try(InputStream inputStream = uri.toURL().openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("add link to video here")
        ) {
           byte[] bytes = inputStream.readAllBytes();
           System.out.println("raw video bytes::" + Arrays.toString(bytes));
           fileOutputStream.write(bytes);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
