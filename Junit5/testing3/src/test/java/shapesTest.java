
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class shapesTest {
    Shapes s=new Shapes();
    @Test
    void testcomputeSquare()
    {


        assertEquals(576,s.computeSquareArea(24));
    }
    @Test
    void testcomputeArea()
    {
        assertEquals(78.5,s.computeCircleArea(5));
    }

}
