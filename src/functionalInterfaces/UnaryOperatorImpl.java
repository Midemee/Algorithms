package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    static void main() {
        UnaryOperator<Double> increasePrice = (price) -> price * 0.8;
        System.out.println("Increased price: " + increasePrice.apply(1000.0));
        UnaryOperator<String> toUpperCase = (word) -> word.toUpperCase();
        System.out.println("Uppercase word: " + toUpperCase.apply("aramide"));
    }
}
