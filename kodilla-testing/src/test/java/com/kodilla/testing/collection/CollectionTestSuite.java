package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> emptyTestList = exterminator.exterminate(new ArrayList<>());
        //Then
        Assert.assertEquals(new ArrayList<>(), emptyTestList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
                normalList.add(4);
                normalList.add(7);
                normalList.add(8);
                normalList.add(11);
                normalList.add(13);
                normalList.add(16);
                normalList.add(18);
                normalList.add(19);
        ArrayList<Integer> expectedList = new ArrayList<>();
                expectedList.add(4);
                expectedList.add(8);
                expectedList.add(16);
                expectedList.add(18);
        //When
        ArrayList<Integer> normalTestList = exterminator.exterminate(new ArrayList<Integer>(normalList));
        //Then
        Assert.assertEquals(4, normalTestList.size());
        Assert.assertEquals(expectedList, normalTestList);
    }
}