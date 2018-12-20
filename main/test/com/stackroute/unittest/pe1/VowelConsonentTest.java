package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelConsonentTest {

    @Test
    public void vowel() {
        String expected = "a- Vowel";
        VowelConsonent obj = new VowelConsonent();
        String actual = obj.check("a", 0);
        assertEquals(expected, actual);
    }
    @Test
    public void consonant() {
        String expected = "b- Consonant";
        VowelConsonent obj = new VowelConsonent();
        String actual = obj.check("b", 0);
        assertEquals(expected, actual);
    }
    @Test
    public void notLetter() {
        String expected = "@- Input is not a letter";
        VowelConsonent obj = new VowelConsonent();
        String actual = obj.check("@", 0);
        assertEquals(expected, actual);
    }
}