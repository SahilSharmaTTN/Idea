package com.sahil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParameterized {

    private String input;
    private String expectedOutput;

    public StringHelperParameterized(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){

        String [][] expectedOutputs= {{"AACD","CD"},{"ACD","CD"}};
        return Arrays.asList(expectedOutputs);

    }

    @Test
    public void truncateAInFirst2Positions() {
        System.out.println("Test 1 running");
        assertEquals(expectedOutput,StringHelper.truncateAInFirst2Positions(input));
    }
}
