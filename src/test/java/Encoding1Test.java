import org.junit.jupiter.api.Assertions;
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
}