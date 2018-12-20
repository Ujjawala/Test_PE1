package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatternTest {

    @Test
    public void times() {
        String expected = "122333444455555";
        Pattern obj = new Pattern();
        String actual = obj.times(5);
        assertEquals(expected, actual);
    }
}