package comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(50);
        numbers.add(36);
        numbers.add(22);
        numbers.add(02);

        System.out.println(numbers);

    }
}
