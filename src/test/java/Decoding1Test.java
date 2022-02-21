import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Decoding1Test {
    @Test
    public void Decoding1_InstantiateClass() {
        Decoding1 decode = new Decoding1("C",2);
        assertEquals(true, decode instanceof Decoding1);
    }

    @Test
    public void Decoding1_getsEncodedText() {
        Decoding1 decode = new Decoding1("C",2);
        String expected = "C";
        assertEquals(true, decode.getEncodedText());
    }

    @Test
    public void Decoding1_getscKey() {
        Decoding1 decode = new Decoding1("C",2);
        int expected = 2;
        assertEquals(expected, decode.getcKey());
    }

    @Test
    public void decodeEncodedText_OneLetterWord_A() {
        Decoding1 decode = new Decoding1("C",2);
        String expected = "A";
        assertEquals(expected, decode.decodeEncodedText());
    }

    @Test
    public void decodeEncodedText_TwoLetterWord_AB() {
        Decoding1 decode = new Decoding1("CD",2);
        String expected = "AB";
        assertEquals(expected, decode.decodeEncodedText());
    }
}