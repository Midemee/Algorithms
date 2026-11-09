package functionalInterfaces;

import java.util.function.Function;

public class FunctionImpl {
    static void main(){
        Function<Double, Double> applyDiscount = (price) -> price * 0.8;
        System.out.println("Discounted price: " + applyDiscount.apply(1000.0));
    }

}
