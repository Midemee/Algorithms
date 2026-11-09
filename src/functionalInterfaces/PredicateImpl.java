package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateImpl {
    static void main(){
        Predicate<Integer> isInStock = (quantity) -> quantity > 0;
        System.out.println("Product is in stock: " + isInStock.test(10));
    }
}
