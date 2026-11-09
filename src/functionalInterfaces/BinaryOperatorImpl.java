package functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    static void main() {
        BinaryOperator<Double> calcTotalPrice = (price, quantity) -> price * quantity;
        System.out.println("Total price: " + calcTotalPrice.apply(1000.0, 5.0));
    }
}
