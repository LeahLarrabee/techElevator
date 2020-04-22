package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {
    private WordCount subject;

    @Before
    public void setUp() throws Exception {
        subject = new WordCount();
    }

    @Test
    public void getCount() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("fa",1);
        expected.put("la",4);

        Map<String, Integer> actual = subject.getCount(new String[]{"fa","la","la","la","la"});

        assertEquals(expected,actual);

    }

    @Test
    public void getCountLong() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Cat",1);
        expected.put("Dog",4);
        expected.put("Bird",3);

        Map<String, Integer> actual = subject.getCount(new String[]{"Cat","Bird","Dog","Bird","Dog","Bird","Dog","Dog"});

        assertEquals(expected,actual);

    }
}