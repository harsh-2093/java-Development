import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS                )
public class ShapesTest {

    @BeforeAll
    static void  beforeAll()
    {
        System.out.println("before all tests");
    }

    Shapes shape;

    @BeforeEach
    void init(){
        shape=new Shapes();
        System.out.println("before test");
    }
    @Test
    void TestSquare()
    {
        assertEquals(25,shape.computeSquareArea(5));
    }
    @Test
    void TestCircle()
    {
        assertEquals(25,shape.computeSquareArea(5));
    }
    @AfterEach
    void destroy()
    {
        System.out.println("after Test");
    }
    @AfterAll
    static  void afterall()
    {
         System.out.println("after all test");
    }
}
