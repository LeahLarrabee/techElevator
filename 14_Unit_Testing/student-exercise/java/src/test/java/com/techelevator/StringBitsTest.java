package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {
    private StringBits subject;

    @Before
    public void setUp() throws Exception {
        subject = new StringBits();
    }

    @Test
    public void getBits() {

        String actual = subject.getBits("HelloBello");
        String expected = "Hloel";

        assertEquals(expected,actual);
    }
}