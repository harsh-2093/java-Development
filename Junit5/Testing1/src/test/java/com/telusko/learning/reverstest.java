package com.telusko.learning;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class reverstest {
    @Test
    void Test(){
        ReverseString r=new ReverseString("harsh");
        assertEquals("hsrah",r.getReversedString());

    }
}
