package com.java.exercise001;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestExercise001 extends TestCase {

    public TestExercise001(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(TestExercise001.class);
    }

    public void testExercise001() {
//        int[] numbers = new int[]{6, 2, 1, 8, 10}; // 16
        int[] numbers = { 1, 1, 11, 2, 3 }; // 6
        assertEquals(6, Exercise001.sum(numbers));
    }
}
