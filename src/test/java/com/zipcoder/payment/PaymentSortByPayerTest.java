package com.zipcoder.payment;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentSortByPayerTest {

    @Test
    public void compareTest() {
        PaymentSortByPayer payer = new PaymentSortByPayer();
        int expected = 1;
        Payment payPal = new PayPal(500L, "Ron Jones", "RJones@Gmail.com");
        Payment check = new Check(400L, "James L", "456673", "609912");
        int actual = payer.compare(payPal, check);
        assertEquals(expected, actual);

    }

}