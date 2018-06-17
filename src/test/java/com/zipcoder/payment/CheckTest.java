package com.zipcoder.payment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void compareToTest() {
        Payment c = new Check(500L, "John Jones", "3567280" , "983329");
        Payment second = new Check(700L, "Tom Ryan", "3884625", "447382");
        int expected = -1;
        int actual = c.compareTo(second);
        assertEquals(expected, actual);
    }

}