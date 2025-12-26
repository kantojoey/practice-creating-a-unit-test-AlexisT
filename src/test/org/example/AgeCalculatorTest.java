package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeCalculatorTest {
    @Test
    public void test100(){
        String result = AgeCalculator.ageUntil100(100);
        assertEquals("Congrats, you are 100 years old!", result);
    }

    @Test
    public void test0(){
        String result = AgeCalculator.ageUntil100(0);
        assertEquals("I guess we'll never know :/", result);
    }

    @Test
    public void testNegative(){
        String result = AgeCalculator.ageUntil100(-23);
        assertEquals("I guess we'll never know :/", result);
    }

    @Test
    public void testLargeNumber(){
        String result = AgeCalculator.ageUntil100(322);
        assertEquals("What are you, some kind of vampire?", result);
    }

    @Test
    public void testNormalNumber(){
        String result = AgeCalculator.ageUntil100(80);
        assertEquals("You are 20 years away from being 100 years old!", result);
    }
}
