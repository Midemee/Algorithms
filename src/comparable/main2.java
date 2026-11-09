package comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class main2 {
    public static void main(String[] args) {
        Comparator<Cat> catComparator = (catOne, catTwo) -> {
            return catTwo.compareTo(catOne);
        };
        Comparator<Cat> catAge = (catOne, catTwo) -> {
            if (catOne.getAge() < catTwo.getAge()) return -1;
            if (catOne.getAge() > catTwo.getAge()) return 1;
            return 0;
        };
        Set<Cat> cats = new TreeSet<>(catAge);
        cats.add(new Cat("Tom", 30));
        cats.add(new Cat("Garfield", 5));
        cats.add(new Cat("Jeremy", 15));
        cats.add(new Cat("Anne", 10));

        System.out.println(cats);

    }
}
