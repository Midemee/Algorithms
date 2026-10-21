import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveNumbersTest {
    @Test
    public void testForThatConsecutiveNumbers(){
        int [] array = {1,2,5,6,7,9};
        int actual = 3;
        int expected = ConsecutiveNumbers.getConsecutiveNumbers(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testForNumbersInConsecutiveOrder(){
        int [] array = {5,6,1,2,3,4};
        int actual = 4;
        int expected = ConsecutiveNumbers.getConsecutiveNumbers(array);
        assertEquals(expected, actual);
    }



}