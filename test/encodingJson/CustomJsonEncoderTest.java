package json;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CustomJsonEncoderTest {
    @Test
    void testCanSerializeToJson() {
        Product product = new Product();
        product.setName("Iphone 20");
        product.setDescription("Iphone 20 is the latest phone from Apple");
        product.setPrice(new BigDecimal("2_000_000.00"));
        product.setQuantity(100);
        String json = CustomJsonEncoder.serializeToJson(product);
        String expected = "{\"name\":\"Iphone 20\",\"description\":\"Iphone 20 is the latest phone from Apple\",\"price\":2000000.00,\"quantity\":100}";
        assertEquals(expected, json);
    }

    @Test
    public void testThatCanSerialiseToJson() throws JsonSerializationException {
        Product product = new Product();
        product.setName("Nokia3310");
        product.setPrice(BigDecimal.valueOf(2000));
        product.setDescription("Survived WWII in Hitlers Pocket");
        product.setQuantity(1);


        String json = CustomJsonEncoder.serializeToJson(product);
        String expected = "{\"name\":\"Nokia3310\",\"price\":2000,\"description\":\"Survived WWII in Hitlers Pocket\",\"quantity\":1}";
        assertEquals(expected, json);


    }


    @Test
    public void testThatMethodcanDeserializeFromJsonToProduct() throws JsonSerializationException {
        String json = "{\"name\":\"Nokia3310\",\"price\":2000,\"description\":\"Survived WWII in Hitlers Pocket\",\"quantity\":1}";
        Product actual = CustomJsonEncoder.deserializeToJavaObject(json);

        Product expected = new Product();
        expected.setName("Nokia3310");
        expected.setPrice(BigDecimal.valueOf(2000));
        expected.setDescription("Survived WWII in Hitlers Pocket");
        expected.setQuantity(1);

        assertEquals(expected, actual);
    }
}