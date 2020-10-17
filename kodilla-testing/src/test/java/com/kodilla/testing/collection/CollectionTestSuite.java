package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Forum Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When pass on emptyList to exterminate() method then it must return emptyList"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator oddNumberExt = new OddNumbersExterminator();

        //When
        List<Integer> result = oddNumberExt.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, result);
    }
    @DisplayName(
            "When pass on Array List with value 1,2,3,4,5,6 to exterminate() method should return ArrayList with 2,4,6"
    )
    @Test
    void testOddNumbersExterminatorNormalList () {
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        OddNumbersExterminator oddNumberExt = new OddNumbersExterminator();
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);

        //When
        List<Integer> result = oddNumberExt.exterminate(normalList);

        //Then
        Assertions.assertEquals(expectedList, result);

    }

    @DisplayName(
            "When pass on Array List with value 1,2,3,4,5,6 to exterminate() method should return ArrayList with 2,4,6"
    )
    @Test
    void testOddNumbersExterminatorNormalList2 () {
        //Given
        List<Integer> normalList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(normalList);

        OddNumbersExterminator oddNumberExt = new OddNumbersExterminator();
        List<Integer> expectedList = Arrays.asList(2,4,6);

        //When
        List<Integer> result = oddNumberExt.exterminate(normalList);

        //Then
        Assertions.assertEquals(expectedList, result);

    }

}
