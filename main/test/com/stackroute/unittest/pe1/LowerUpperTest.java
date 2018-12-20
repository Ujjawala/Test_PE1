package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowerUpperTest {

    @Test
    public void lower() {
        String expected = "a is Lower case letter.";
        LowerUpper obj = new LowerUpper();
        String actual = obj.check('a');
        assertEquals(expected, actual);
    }
    @Test
    public void upper() {
        String expected = "A is Upper case letter.";
        LowerUpper obj = new LowerUpper();
        String actual = obj.check('A');
        assertEquals(expected, actual);
    }
    @Test
    public void digit() {
        String expected = "4 is Digit.";
        LowerUpper obj = new LowerUpper();
        String actual = obj.check('4');
        assertEquals(expected, actual);
    }
    @Test
    public void special() {
        String expected = "@ is Special Character.";
        LowerUpper obj = new LowerUpper();
        String actual = obj.check('@');
        assertEquals(expected, actual);
    }
}