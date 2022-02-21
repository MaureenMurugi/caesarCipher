import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Encoding1Test {
    @Test
    public void Encoding1_InstantiateClass() {
        Encoding1 encode = new Encoding1("A",2);
        assertEquals(true, encode instanceof Encoding1);
    }
}