package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TomJerryTest {

    @Test
    public void checkJerry() {
        TomJerry obj = new TomJerry();
        String expected = "Jerry";
        String actual = obj.check(22);
        assertEquals(expected,actual);
    }
    @Test
    public void checkTom() {
        String expected = "Tom";
        TomJerry obj = new TomJerry();
        String actual = obj.check(23);
        assertEquals(expected,actual);
    }
    @Test
    public void checkNot20_30() {
        String expected = "Not in between 20 & 30";
        TomJerry obj = new TomJerry();
        String actual = obj.check(2);
        assertEquals(expected,actual);
    }
}