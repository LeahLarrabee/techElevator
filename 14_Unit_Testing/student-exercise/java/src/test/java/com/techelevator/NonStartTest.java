package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {

    private NonStart subject;

    @Before
    public void setUp() throws Exception {
        subject = new NonStart();
    }

    @Test
    public void getPartialString() {
        String actual = subject.getPartialString("Hello","There");
        String expected = "ellohere";

        assertEquals(expected,actual);


    }
}