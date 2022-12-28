package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void init(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void shouldWorkCorrectWithOne(){
        int actual = sumCalculator.sum(1);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void shouldWorkCorrectWithThree(){
        int actual = sumCalculator.sum(3);
        Assertions.assertEquals(6, actual);
    }
    @Test
    public void shouldWorkCorrectWithZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }


}
