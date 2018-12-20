package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumIntegerTest {

    @Test
    public void sum() {
        int[] expected = {27, 1};
        String[] arr = {"2","4","5","3","6","7", "re"};
        SumInteger obj = new SumInteger();
        int[] actual = obj.sum(arr);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}