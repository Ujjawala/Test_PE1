package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    @Test
    public void notPalindrome() {
        Palindrome obj = new Palindrome();
        String expected = "45464 is not palindrome";
        String actual = obj.palindrome(45464);
        assertEquals(expected,actual);
    }
    @Test
    public void palindromeNotMore25() {
        Palindrome obj = new Palindrome();
        String expected = "4534354 is palindrome and sum is not more than 25";
        String actual = obj.palindrome(4534354);
        assertEquals(expected,actual);
    }
    @Test
    public void palindromeMore25() {
        Palindrome obj = new Palindrome();
        String expected = "8888888 is palindrome and sum is more than 25";
        String actual = obj.palindrome(8888888);
        assertEquals(expected,actual);
    }
}