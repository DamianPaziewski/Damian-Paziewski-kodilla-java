package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int [] numbers = {4, 7, 13, 3, 22, 65, 17, 22, 45, 2, 1, 1, 32, 24, 8, 14, 11, 20, 4, 16};
        double expectedAverage = 16.55;

        //When
        double numbersAverage = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(expectedAverage, numbersAverage, 0.001);
    }
}