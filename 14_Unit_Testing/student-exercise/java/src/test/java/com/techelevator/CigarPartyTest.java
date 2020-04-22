package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {
    private CigarParty subject;

    @Before
    public void setUp() throws Exception {
        subject = new CigarParty();
    }

    @Test
    public void havePartyIsWeekendSuccessful() {
        boolean actual = subject.haveParty(70, true);

        assertTrue("If weekend should have no upper bound",actual);
    }

    @Test
    public void havePartyIsNotWeekendSuccessful(){
        boolean actual = subject.haveParty(40,false);

        assertTrue("If not weekend should have min 40 max 60.", actual);
    }

    @Test
    public void havePartyIsNotWeekendUnsuccessful(){
        boolean actual = subject.haveParty(65,false);

        assertFalse("If not a weekend have max bound of 60", false);
    }

    @Test
    public void havePartyIsWeekendUnsuccessful(){
        boolean actual = subject.haveParty(35,true);

        assertFalse("If it is the weekend have min bound of 40", false);
    }
}