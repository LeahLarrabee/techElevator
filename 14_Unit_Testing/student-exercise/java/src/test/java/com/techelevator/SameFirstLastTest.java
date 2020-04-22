package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {
    private SameFirstLast subject;

    @Before
    public void setUp() throws Exception {
        subject = new SameFirstLast();
    }

    @Test
    public void isItTheSameNull() {

        int [] num = new int[]{};

        boolean actual = subject.isItTheSame(num);

        assertFalse(actual);
    }

    @Test
    public void isItTheSame() {

        int [] num = new int[]{1,2,3,1};

        boolean actual = subject.isItTheSame(num);

        assertTrue(actual);
    }
}