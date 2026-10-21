import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountStringTest {
    @Test
    public void countNumbersOfStrings_RemoveSpacesTest(){
        CountString countString = new CountString();
        String sentence = "   fly me   to   the moon  ";
        int expected = 4;
        int actual = countString.getNumberOfStrings(sentence);
        assertEquals(expected, actual);
    }

}