package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFashionTest {
    private DateFashion subject;

    @Before
    public void setUp() throws Exception {
        subject = new DateFashion();
    }

    @Test
    public void getATableEight() {
        int actual = subject.getATable(5,8);
        assertEquals("If either are 8 or more should return 1",1, actual);

    }

    @Test
    public void getATableTwo(){
        int actual = subject.getATable(2,9);
        assertEquals("Exception if either are 2 or less then no table", 0,actual);
    }

    @Test
    public void getATableMaybe(){
        int actual = subject.getATable(5,5);
        assertEquals("Should return maybe",1,actual);
    }
}