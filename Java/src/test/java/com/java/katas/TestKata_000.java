package com.java.katas;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Katas
 *
 * @author Alex T.H.
 * @version v0.0.2
 * @since 21.0.0 2024-08-23
 */
public class TestKata_000 extends TestCase {

    public TestKata_000(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(TestKata_000.class);
    }

    public void testKata000Case0() {
        int[] numbers = { 1, 1, 11, 2, 3 }; // 6
        assertEquals(6, Kata_000.sum(numbers));
    }

    public void testKata000Case1(){
        int[] numbers = {6, 2, 1, 8, 10}; // 16
        assertEquals(16, Kata_000.sum(numbers));
    }
}
