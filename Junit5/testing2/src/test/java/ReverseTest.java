import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest {
    ReverseString r=new  ReverseString("harsh");
    @Test
    void test(){


        assertEquals("hsrah",r.getReversedString());
    }
    @Test
    void testReverseSTring_multiplewords(){


        assertEquals("hsrah",r.getReversedString());
    }
}
