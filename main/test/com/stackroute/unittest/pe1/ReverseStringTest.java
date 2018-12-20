package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void strReverse() {
        ReverseString obj = new ReverseString();
        StringBuilder expected = new StringBuilder("nodnol");
       //System.out.println("expected****"+ expected);
        StringBuilder actual = new StringBuilder(obj.strReverse(new StringBuilder("london")));
        //System.out.println("actual****"+ actual);
        assertEquals(expected.toString(), actual.toString());
        //assertEquals(expected,actual);   it compares object thats why test fails
    }
}