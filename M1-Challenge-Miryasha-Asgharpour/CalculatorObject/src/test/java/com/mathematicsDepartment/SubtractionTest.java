package com.mathematicsDepartment;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void shouldReturnZero() {
        Subtraction instance = new Subtraction(4,4);
        double result = instance.subtractor();
        double expResult = 0;

        assertEquals(expResult, result,0);
    }

    @Test
    public void shouldReturnPositiveNumber() {
        Subtraction instance = new Subtraction(4,4);
        double result = instance.subtractor();
        double expResult = 0;

        assertEquals(expResult, result,0);
    }

    @Test
    public void shouldReturnNegativeNumber() {
        Subtraction instance = new Subtraction(-8,2);
        double result = instance.subtractor();
        double expResult = -10;

        assertEquals(expResult, result,0);
    }


}