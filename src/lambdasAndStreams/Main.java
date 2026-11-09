package lambdasAndStreams;

import java.util.stream.IntStream;

public class Main {
    static void main(){
        //Todo: Write a function that sums 1 and 10

        int summedFirstTenRealNumbers = sumFirstTenRealNumbers();
        if (summedFirstTenRealNumbers != 55){
            throw new RuntimeException("Error: invalid sun received, sum should be 55");
        }
        IO.println("TEST PASSED :)");
        IO.println(multiplyFirstTenRealNumbers());
    }
    public static int sumFirstTenRealNumbers(){
        return IntStream.rangeClosed(1,10)
                .sum();

    }

    public static int sumFirstTenRealNumbers(int number){
        if (number < 0) throw new IllegalArgumentException("Error: invalid number");
        return IntStream.rangeClosed(1,number)
                .sum();

    }

    public static int multiplyFirstTenRealNumbers(){
        return IntStream.rangeClosed(1,10)
                .reduce(1, (x, y) -> x * y);

    }
}
