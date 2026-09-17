import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    HugeInteger hugeIntegers = new HugeInteger();

    @Test
    public void testFor_parseStringToArray(){
        String digits = "9876543219876543219876543219876543212345";
        hugeIntegers.parse(digits);
        assertEquals(digits, hugeIntegers.toString());
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

        HugeInteger sum = hugeIntegers.add(hugeIntegersTwo);

        assertEquals("222000", sum.toString());
    }

    @Test
    public void addTwoHugeIntegerWithDifferentLengthTest(){
        String digitOne = "9900";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "100";
        hugeIntegersTwo.parse(digitTwo);

        HugeInteger sum = hugeIntegers.add(hugeIntegersTwo);

        assertEquals("10000", sum.toString());
    }

    @Test
    public void subtractTwoHugeIntegerTest(){
        String digitOne = "5000100983792020";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "40002838289";
        hugeIntegersTwo.parse(digitTwo);

        HugeInteger difference = hugeIntegers.subtract(hugeIntegersTwo);

        assertEquals("5000060980953731", difference.toString());
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

    @Test
    public void equalHugeIntegersAreGreaterThanOrEqualToEachOtherTest(){
        String digitOne = "555555555555";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "555555555555";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isGreaterThanOrEqualTo(hugeIntegersTwo));
    }

    @Test
    public void equalHugeIntegersAreLessThanOrEqualToEachOtherTest(){
        String digitOne = "555555555555";
        hugeIntegers.parse(digitOne);

        HugeInteger hugeIntegersTwo = new HugeInteger();
        String digitTwo = "555555555555";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isLessThanOrEqualTo(hugeIntegersTwo));
    }

    @Test
    public void parsedZeroIsZeroTest(){
        hugeIntegers.parse("0");

        assertTrue(hugeIntegers.isZero());
    }
}