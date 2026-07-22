import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class TestException {
    @Test
    void testSortingarray(){


        SortingArray arr=new SortingArray();
        int unsorted[]={2,3,1};
        assertTimeout(Duration.ofMillis(1),()->arr.sortingArray(unsorted));

//            int sorted[]=arr.sortingArray(unsorted);
//
//        try {
//
////        for(int e:sorted)
////        {
////            System.out.print(e);
////        }
//            fail();
//        }
//        catch (NullPointerException e){
//            System.out.println("Exception generated");
//        }
//        assertThrows(NullPointerException.class,()->arr.sortingArray(unsorted));
    }
}
