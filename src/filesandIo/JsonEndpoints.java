package filesandIo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class JsonEndpoints {
    public static void main(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        URI postUri = URI.create(url);
        String fileLocation = "/home/aramide/Documents/files/posts.json";

        String postUri2 = "https://jsonplaceholder.typicode.com/posts/1";
        URI postUrl2 = URI.create(postUri2);
        String fileLocation2 = "/home/aramide/Documents/files/post.json";

        String commentUrl = "https://jsonplaceholder.typicode.com/comments";
        URI commentUri = URI.create(commentUrl);
        String commentFileLocation = "/home/aramide/Documents/files/comments.json";

        String commentUrl2 = "https://jsonplaceholder.typicode.com/comments?postId=1";
        URI commentUri2 = URI.create(commentUrl2);
        String commentFileLocation2 = "/home/aramide/Documents/files/comments2.json";



        try(InputStream input = postUri.toURL().openStream();
            InputStream commentInput = commentUri.toURL().openStream();
            InputStream commentInput2 = commentUri2.toURL().openStream();
            InputStream input2 = postUrl2.toURL().openStream();

        ){
            byte[] bytes = input.readAllBytes();
            Files.write(Paths.get(fileLocation), bytes);

            byte[] commentBytes = commentInput.readAllBytes();
            Files.write(Paths.get(commentFileLocation), commentBytes);

            byte[] commentsBytes = input2.readAllBytes();
            Files.write(Paths.get(fileLocation2), commentsBytes);

            byte[] comments2Bytes = commentInput2.readAllBytes();
            Files.write(Paths.get(commentFileLocation2), comments2Bytes);

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

}
