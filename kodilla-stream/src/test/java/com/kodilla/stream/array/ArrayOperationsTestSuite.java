package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{21,22,23,24,25,26,27,28,29,30,50,51,52,53,54,55,56,57,58,1};


        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(37.1, average, 0.01);
    }

}
