package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    static void main (){
        BiPredicate<Double, Integer> isAffordableAndInStock = (price, quantity) -> price < 1000 && quantity > 0;
        System.out.println("Product is affordable and in stock: " + isAffordableAndInStock.test(500.0, 10));
    }

}
