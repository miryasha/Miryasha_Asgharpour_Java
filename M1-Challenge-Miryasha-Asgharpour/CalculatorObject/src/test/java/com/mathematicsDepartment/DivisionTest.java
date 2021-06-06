package com.mathematicsDepartment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldReturnZero() {
        Division instance = new Division(0,1);
        double result = instance.divider();
        double expResult = 0;
        //System.out.println(result);
        assertEquals(expResult, result,0);
    }

}