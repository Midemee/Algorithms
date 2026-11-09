package encodingJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomJsonEncoder{


    public static String serializeToJson(Product product) throws JsonSerializationException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(product);
        } catch(JsonProcessingException exception) {
            exception.printStackTrace();
            throw new JsonSerializationException("Failed to convert this to json");
        }

    }


    public static Product deserializeToJavaObject(String json) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Product.class);
        } catch (JsonProcessingException exception) {
            throw new RuntimeException(exception);
        }
    }
}