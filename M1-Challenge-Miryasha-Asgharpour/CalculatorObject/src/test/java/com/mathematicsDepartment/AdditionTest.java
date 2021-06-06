package com.mathematicsDepartment;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {



    @Test
    public void shouldReturnsSumOfTwoNumber(){
        Addition add = new Addition(1, 2);
        double results = add.Adder();
         assertEquals(3,results,0);

    }

    @Test
    public void shouldReturnsSumOfNegativeNumber(){
        Addition add = new Addition(-1, -2);
        double results = add.Adder();
        assertEquals(-3,results,0);

    }

}