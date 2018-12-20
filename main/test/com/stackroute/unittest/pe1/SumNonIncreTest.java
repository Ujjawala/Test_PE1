package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumNonIncreTest {

    @Test
    public void sum() {
        int expected = 14;
        int[] arr = {6,5,4,7,4,3};
        SumNonIncre obj = new SumNonIncre();
        int actual = obj.sum(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void check() {
        boolean expected = false;
        SumNonIncre obj = new SumNonIncre();
        boolean actual = obj.check(14);
        assertEquals(expected, actual);
    }
}