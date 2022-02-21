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

    @Test
    public void decodeEncodedText_IgnoringNonCharacters_AB1D() {
        Decoding1 decode = new Decoding1("CD1F",2);
        String expected = "AB1D";
        assertEquals(expected, decode.decodeEncodedText());
    }

    @Test
    public void decodeEncodedText_DecodeSentence_AB_CD() {
        Decoding1 decode = new Decoding1("CD EF",2);
        String expected = "AB CD";
        assertEquals(expected, decode.decodeEncodedText());
    }

    @Test
    public void decodeEncodedText_DecodeLetterNegativeIndex_Y() {
        Decoding1 decode = new Decoding1("A",2);
        String expected = "Y";
        assertEquals(expected, decode.decodeEncodedText());
    }
}