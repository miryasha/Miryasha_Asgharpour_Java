package com.mathematicsDepartment;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void shouldReturnZero() {
        Multiplication instance = new Multiplication(0,1);
        double result = instance.multiplier();
        double expResult = 0;

        assertEquals(expResult, result,0);
    }

    @Test
    public void shouldReturnPositiveNumber() {
        Multiplication instance = new Multiplication(-1,-31);
        double result = instance.multiplier();
        double expResult = 31;

        assertEquals(expResult, result,0);
    }

    @Test
    public void shouldReturnNegetiveNumber() {
        Multiplication instance = new Multiplication(-1,31);
        double result = instance.multiplier();
        double expResult = -31;

        assertEquals(expResult, result,0);
    }



}