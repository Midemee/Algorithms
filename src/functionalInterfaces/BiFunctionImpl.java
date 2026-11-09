package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    static void main (){
        BiFunction<Double, Integer, Double> calculateTotalPrice = (price, quantity) -> price * quantity;
        System.out.println("Total price: " + calculateTotalPrice.apply(1000.0, 5));
    }
}
