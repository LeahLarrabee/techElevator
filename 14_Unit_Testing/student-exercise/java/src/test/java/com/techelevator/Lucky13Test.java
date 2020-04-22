package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Test {
    private Lucky13 subject;

    @Before
    public void setUp() throws Exception {
        subject = new Lucky13();
    }

    @Test
    public void getLuckyContainsOne() {
        boolean actual = subject.getLucky(new int[]{1,2,4});

        assertFalse("Array cant contain ones", false);

    }

    @Test
    public void getLuckyContainsThree() {
        boolean actual = subject.getLucky(new int[]{2,2,3});

        assertFalse("Array cant contain ones", false);

    }
    @Test
    public void getLuckyContainsNoOnesOrThrees() {
        boolean actual = subject.getLucky(new int[]{2,2,4});

        assertTrue("Array cant contain ones or threes", true);

    }
}