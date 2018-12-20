package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringNTimesTest {

    @Test
    public void times() {
        StringNTimes obj = new StringNTimes();
        String expected = "stackrouteuteuteute";
        String actual = obj.times("stackroute", 3);
        assertEquals(expected, actual);
    }
}