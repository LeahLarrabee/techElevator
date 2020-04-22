package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {

    private MaxEnd3 subject;

    @Before
    public void setUp() throws Exception {
        subject = new MaxEnd3();
    }

    @Test
    public void makeArraySame() {
        int [] num = new int[]{4,4,4};
        int [] actual = subject.makeArray(num);

        int [] expected = new int []{4,4,4};

    assertArrayEquals(expected, actual);
    }

    @Test
    public void makeArray() {
        int [] num = new int[]{9,0,12};
        int [] actual = subject.makeArray(num);

        int [] expected = new int []{12,12,12};

        assertArrayEquals(expected, actual);
    }
}