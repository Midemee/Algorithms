import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    HugeInteger hugeIntegers = new HugeInteger();
    @Test
    public void testFor_parseStringToArray(){
        String digits = "9876543219876543219876543219876543212345";
        int[] expected = {9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,2,3,4,5};
        assertArrayEquals(expected, hugeIntegers.parse(digits));
    }

    @Test
    public void testFor_UsingToStringMethod() {
        HugeInteger numbers = new HugeInteger();
        String values = "1234567891234567891234567891234567891234";
        numbers.parse(values);
        assertEquals(values, numbers.toString());
    }

    @Test
    public void testFor_theSameStringReturnsTrue(){
        String digitOne = "987654321";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "987654321";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isEqualTo(hugeIntegersTwo));
    }

    @Test
    public void testFor_DifferentStringReturnsTrue(){
        String digitOne = "64345678906754";
        hugeIntegers.parse(digitOne);
        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "12345678965";
        hugeIntegersTwo.parse(digitTwo);
        assertTrue(hugeIntegers.isNotEqualTo(hugeIntegersTwo));
    }

    @Test
    public void addTwoHugeIntegerTest(){
        String digitOne = "111000";
        hugeIntegers.parse(digitOne);
        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "111000";
        hugeIntegersTwo.parse(digitTwo);
        hugeIntegers.add(hugeIntegersTwo);
        int[] summedIntegers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,2,2,2,0,0,0};
        assertArrayEquals(hugeIntegers.getNumberArray(), summedIntegers);
    }

    @Test
    public void addTwoHugeIntegerWithDifferentLengthTest(){
        String digitOne = "9900";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "100";
        hugeIntegersTwo.parse(digitTwo);

        hugeIntegers.add(hugeIntegersTwo);
        int[] summedIntegers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,0,0,0,0};

        assertArrayEquals(hugeIntegers.getNumberArray(), summedIntegers);
    }

    @Test
    public void subtractTwoHugeIntegerTest(){
        String digitOne = "5000100983792020";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "40002838289";
        hugeIntegersTwo.parse(digitTwo);

        hugeIntegers.subtract(hugeIntegersTwo);
        int[] subtractedIntegers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,5,0,0,0,0,6,0,9,8,0,9,5,3,7,3,1};
        assertArrayEquals(hugeIntegers.getNumberArray(),subtractedIntegers);
    }

    @Test
    public void firstHugeIntegerIsGreaterThanSecondInteger_returnTrueTest(){
        String digitOne = "9000000000000000";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isGreaterThan(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsNotGreaterThanSecondIntegerTest(){
        String digitOne = "900000000000000";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertFalse(hugeIntegers.isGreaterThan(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsLessThanSecondIntegerTest(){
        String digitOne = "900000000000";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isLessThan(hugeIntegersTwo));
    }
}