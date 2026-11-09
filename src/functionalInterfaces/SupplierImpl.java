package functionalInterfaces;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class SupplierImpl {
    static void main() {
        Supplier<Integer> integerSupplier = () -> new SecureRandom().nextInt(1,5);
        System.out.println(integerSupplier.get());
    }
}
