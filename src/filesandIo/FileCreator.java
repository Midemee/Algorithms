package filesandIo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static void main(String[] args) {
        String[] paths = {"posts", "posts/1", "posts/1/comments", "comments?postId=1"};
        String[] fileNames = {"posts", "post", "comments", "comment"};
        final String BASE_URL = "https://jsonplaceholder.typicode.com/";
        final String FILE_PATH =  "/home/aramide/Documents/files/";

        if (paths.length != fileNames.length) {
            throw new IllegalArgumentException(
                    "Every API path must have a matching file name."
            );
        }

        for (int index = 0; index < paths.length; index++) {
            String url = BASE_URL + paths[index];
            URI uri = URI.create(url);

            try(InputStream inputStream = uri.toURL().openStream()) {
                String fileName = FILE_PATH + fileNames[index] + ".json";
                Path path = Path.of(fileName);
                byte[] bytes = inputStream.readAllBytes();
                Files.write(path, bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
