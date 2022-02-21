import model.Encoding1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Encoding1Test {
    @Test
    public void Encoding1_InstantiateClass() {
        Encoding1 encode = new Encoding1("A",2);
        assertEquals(true, encode instanceof Encoding1);
    }
// Reads the users input
    @Test
    public void Encoding1_getPText() {
        Encoding1 encode = new Encoding1("A",2);
        String expected = "A";
        assertEquals(true, encode.getPText());
    }

    @Test
    public void Encoding1_getCKey() {
        Encoding1 encode = new Encoding1("A",2);
        int expected = 2;
        assertEquals(expected, encode.getcKey());
    }

    @Test
    public void isValidKey_WhenInvalidKey_FALSE() {
        Encoding1 encode = new Encoding1("A",29);
       boolean expected = false;
        assertEquals(expected, encode.isValidKey());
    }

    @Test
    public void isValidKey_WhenInvalidKey_TRUE() {
        Encoding1 encode = new Encoding1("A",1);
        boolean expected = true;
        assertEquals(expected, encode.isValidKey());
    }

    @Test
    public void encodePText_OneLetterWord_C() {
        Encoding1 encode = new Encoding1("A",2);
        String expected = "C";
        assertEquals(expected, encode.encodePText());
    }

    @Test
    public void encodePText_TwoLetterWord_CD() {
        Encoding1 encode = new Encoding1("AB",2);
        String expected = "CD";
        assertEquals(expected, encode.encodePText());
    }

    @Test
    public void encodePText_ManyLetterWord_CDEF() {
        Encoding1 encode = new Encoding1("ABCD",2);
        String expected = "CDEF";
        assertEquals(expected, encode.encodePText());
    }
}