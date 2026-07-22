import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TrailTest {
    Shapes s=new Shapes();
    @Test
    void test(){
        assertEquals(6,6);
    }

    @Test
    void testsupplier(){
        assertEquals(6,6,()->"Area is wrong ");
    }
    @Test
    void testsquare()
    {

        assertNotEquals(506,s.computeSquareArea(24),"heloooooo");
    }
    @Test
    void testcircle()
    {
        assertNotEquals(576,s.computeCircleArea(24));
    }
    @Test
    void testArray(){
        int [] expected={2,4,6,8};
        int [] actual={2,4,8,6};
        Arrays.sort(actual);
        assertArrayEquals(expected,actual);
//        assertEquals(expected,actual);
    }
}
