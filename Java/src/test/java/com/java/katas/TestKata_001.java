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
public class TestKata_001 extends TestCase {

    public TestKata_001(String testName) {
        super(testName);
    }

    public static Test Suite() {
        return new TestSuite(TestKata_001.class);
    }

    public void testKata001Case0(){
        String text = "HellO";
        assertEquals("hELLo", Kata_001.textEvaluate(text));
    }

    public void testKata001Case1(){
       String text = "EtherHacker99*";
       assertEquals("eTHERhACKER99*", Kata_001.textEvaluate(text));
    }

}
