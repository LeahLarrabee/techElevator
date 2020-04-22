package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {
    private FrontTimes subject;

    @Before
    public void setUp() throws Exception {
        subject = new FrontTimes();
    }

    @Test
    public void generateStringOnlyThreeLetters() {
        String expected = "CatCatCat";
        String actual = subject.generateString("Cat", 3);

        assertEquals(expected,actual);
    }

    @Test
    public void generateStringNull(){
        String expected ="";
        String actual = subject.generateString("",0);

        assertEquals(expected,actual);
    }

    @Test
    public void getnerateStringLessThenThreeLetters(){
        String expected = "ZoZo";
        String actual = subject.generateString("Zo",2);

        assertEquals(expected,actual);
    }
}