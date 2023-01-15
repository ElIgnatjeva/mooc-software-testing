package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher = new CaesarShiftCipher();

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @Test
    public void positiveShift() {
        String result = cipher.CaesarShiftCipher("lena", 3);
        Assertions.assertEquals("ohqd", result);
    }

    @Test
    public void zeroShift() {
        String result = cipher.CaesarShiftCipher("word", 0);
        Assertions.assertEquals("word", result);
    }

    @Test
    public void negativeShift() {
        String result = cipher.CaesarShiftCipher("word", -2);
        Assertions.assertEquals("umpb", result);
    }

    @Test
    public void upperCase() {
        String result = cipher.CaesarShiftCipher("MARGATETTI", 5);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void lastLetters() {
        String result = cipher.CaesarShiftCipher("xyz", 4);
        Assertions.assertEquals("bcd", result);
    }
}
