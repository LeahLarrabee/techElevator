package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGroupNameTest {

    private AnimalGroupName subject;

    @Before
    public void setUp() throws Exception {
        subject = new AnimalGroupName();
    }
    /*
    *test if " " is passed
    * unknowned should be returned
     */
    @Test
    public void getHerdNull() {
        String expected = "unknown";
        String actual = subject.getHerd("");

        assertEquals(expected,actual);

    }
    /*
    *test if multi cased string passed
    * method will cast
     */
    @Test
    public void getHerdMultiCase() {
        String expected = "GiRaFfE";
        String actual = subject.getHerd("Tower");

        assertEquals(expected,actual);

    }

    /*
     *test if unlisted animal passed
     *method will returned unknown
     */
    @Test
    public void getHerdAllGood() {
        String expected = "Crow";
        String actual = subject.getHerd("Murder");

        assertEquals(expected,actual);

    }


}