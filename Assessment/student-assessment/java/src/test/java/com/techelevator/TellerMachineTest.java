package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TellerMachineTest {

    private TellerMachine tm;

    @Before
    public void setUp() throws Exception {
        tm = new TellerMachine("test",new BigDecimal(5),new BigDecimal(5));
    }

    @Test
    public void balance() {
        BigDecimal excepted = new BigDecimal(0);
        BigDecimal actual = tm.balance();

        assertEquals(excepted,actual);
    }

    @Test
    public void cardNumberBegin5And16Digits() {
        assertTrue(tm.cardNumber("5123451234512341"));
    }

    @Test
    public void cardNumberBegin4And13Digits() {
        assertTrue(tm.cardNumber("4123451234512"));
    }

    @Test
    public void cardNumberBegin4And116Digits() {
        assertTrue(tm.cardNumber("4123451234512123"));
    }

    @Test
    public void cardNumberBegin3SecondDigit4() {
        assertTrue(tm.cardNumber("34"));
    }

    @Test
    public void cardNumberBegin3SecondDigit7() {
        assertTrue(tm.cardNumber("37"));
    }
}