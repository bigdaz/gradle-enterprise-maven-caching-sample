package com.example;

import com.util.Util;
import junit.framework.TestCase;

public class UtilTest extends TestCase {
    public void testUtil() {
        assertEquals("This is the output", Util.getOutput());
    }
}
