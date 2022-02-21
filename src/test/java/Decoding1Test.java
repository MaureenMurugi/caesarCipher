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
}