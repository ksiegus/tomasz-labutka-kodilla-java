package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;


    @Test
    public void testCalculations() {
        //Given
        //When
        double result1 = calculator.add(4, 5);
        double result2 = calculator.sub(104, 5);
        double result3 = calculator.mul(13, 3);
        Double result4 = calculator.div(81, 3);
        Double result5 = calculator.div(81, 0);
        System.out.println(result5);

        //Then
        assertEquals(9, result1);
        assertEquals(99, result2);
        assertEquals(39, result3);
        assertEquals(27, result4);
        assertNull(result5);
    }
}
