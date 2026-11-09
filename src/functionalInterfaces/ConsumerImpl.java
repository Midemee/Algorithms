package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(12);
        numbers.add(36);
        numbers.add(32);

        numbers.forEach((number) -> {
            System.out.println(number);
        });
    }


}