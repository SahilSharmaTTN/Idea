package com.sahil;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;


public class StringHelperTest {

    @BeforeClass
    public static void Welcome(){

        System.out.println("hello");
    }

    @Before
    public void setup(){
        System.out.println("Setting up");
    }

    @Test
    public void truncateAInFirst2Positions() {
        System.out.println("Test 1 running");
       assertEquals("ABC",StringHelper.truncateAInFirst2Positions("AAABC"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame() {
        System.out.println("Test 2 running");
        assertTrue(StringHelper.areFirstAndLastTwoCharactersTheSame("AABCAA"));
     //   assertFalse(StringHelper.areFirstAndLastTwoCharactersTheSame("AABCAA"));

    }

    @Test
    public void checkArraysTest(){
        int A[] = {5,4,3,2,1};
        int B[] = {1,2,3,4,5};

        Arrays.sort(A);

        assertArrayEquals(B,A);
    }

    @Test(expected = NullPointerException.class)
    public void checkArraysNull(){
        int A[] = null;
        Arrays.sort(A);
    }



    @After
    public void afterTest(){
        System.out.println("after Test");
    }

    @AfterClass
    public static void bye(){
        System.out.println("Bye");
    }
}