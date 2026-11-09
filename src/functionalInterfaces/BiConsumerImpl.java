package functionalInterfaces;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    static void main() {
        Map<String, Integer> map = Map.of(
                "John", 25,
                "Jane", 30,
                "Jack", 35);

        map.forEach((name, age) -> System.out.println("My name is " + name + " and I am " + age + " years old"));

    }
}
