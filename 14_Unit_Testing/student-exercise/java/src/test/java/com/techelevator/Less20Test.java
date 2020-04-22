package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Less20Test {

    private Less20 subject;

    @Before
    public void setUp() throws Exception {
        subject = new Less20();
    }

    @Test
    public void isLessThanMultipleOf20OneLess() {
        boolean actual = subject.isLessThanMultipleOf20(19);

        assertTrue(actual);
    }
    @Test
    public void isLessThanMultipleOf20TwoLess() {
        boolean actual = subject.isLessThanMultipleOf20(18);

        assertTrue(actual);
    }

    @Test
    public void isLessThanMultipleOf20ZeroLess() {
        boolean actual = subject.isLessThanMultipleOf20(20);

        assertFalse("Should only be one or two less than multiple of 20.",actual);
    }
}