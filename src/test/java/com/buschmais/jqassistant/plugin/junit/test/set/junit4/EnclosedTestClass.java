package com.buschmais.jqassistant.plugin.junit.test.set.junit4;

import org.junit.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * A JUnit4 test classes using enclosed test classes.
 */
@RunWith(Enclosed.class)
public class EnclosedTestClass {

    public static class FirstTest {
        @Test
        public void testMethod() {
        }
    }

    public static class SecondTest {
        @Test
        public void testMethod() {
        }
    }

}
