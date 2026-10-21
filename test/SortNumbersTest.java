import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {
    @Test
    public void sortNumbersInDescendingOrder(){
        int [] numbers = {5, 8, 9, 3, 2};
        int [] actual = SortNumbers.getSortNumbers(numbers);
        int [] expected = {9, 8, 5, 3, 2};
        assertArrayEquals(actual, expected);
    }


}