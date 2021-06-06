package com.calendarCompany;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

   Converter converter = new Converter();

    @Test
    public void shouldReturnFalseIfTheInputIsNotBetweenOneToTwelveForMonth() {
       boolean result = converter.checkMonthNum(14);
       assertNotEquals(true,result);
    }

    @Test
    public void shouldReturnFalseIfTheInputIsNotBetweenOneToSevenForDay() {
        boolean result = converter.checkDayNum(13);
        assertNotEquals(true,result);
    }

    @Test
    public void shouldReturnNameOfTheMonthByGivingANumberOfThatMonth() {
        String result = converter.generateMonthName(12);

        assertEquals(result,"December");

    }

    @Test
    public void shouldReturnNameOfTheDayByGivingANumberOfThaDay() {
        String result = converter.generateDayName(3);
        
        assertEquals(result,"Tuesday");

    }


}