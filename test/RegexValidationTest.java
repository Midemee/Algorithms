import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexValidationTest {

    @Test
    public void testThatEmailValidationMatchesRegexPattern() {
        assertTrue(RegexValidation.isEmailValidation("p.nwankwo@native.semicolon.africa"));
    }

    @Test
    public void testThatEmailValidationRejectsInvalidEmail() {
        assertFalse(RegexValidation.isEmailValidation("aramideashiwaju.native.semicolon.africa"));
        assertFalse(RegexValidation.isEmailValidation("mide.ashiwaju@native"));
    }

    @Test
    public void testThatPasswordValidationAcceptsValidPassword() {
        assertTrue(RegexValidation.isPasswordValidation("Temitope@93"));
        assertTrue(RegexValidation.isPasswordValidation("aramide93#"));
        assertTrue(RegexValidation.isPasswordValidation("ashiwaju1+"));
    }

    @Test
    public void testThatPasswordValidationRejectsInvalidPassword() {
        assertFalse(RegexValidation.isPasswordValidation("A1@mide"));
        assertFalse(RegexValidation.isPasswordValidation("aramideAshiwaju12345678@"));
        assertFalse(RegexValidation.isPasswordValidation("Aramide@"));
        assertFalse(RegexValidation.isPasswordValidation("Ara mide1@"));
    }
}


