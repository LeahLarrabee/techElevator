package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = new Employee();
    }

    @Test
    public void raiseSalary() {
        BigDecimal expected = new BigDecimal(30);

        BigDecimal actual = emp.raiseSalary(new BigDecimal(30));

        assertEquals(expected,actual);
    }
}