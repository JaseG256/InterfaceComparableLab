package com.zipcoder.payment;

import org.junit.Test;

import static org.junit.Assert.*;

public class PayPalTest {

    @Test
    public void getIdTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        Long expected = 500L;
        payPal.setId(500L);
        Long actual = payPal.getId();
        assertEquals(expected, actual);

    }

    @Test
    public void setIdTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        Long expected = 500L;
        payPal.setId(500L);
        Long actual = payPal.getId();
        assertEquals(expected, actual);

    }

    @Test
    public void getPayerNameTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        String expected = "John Jones";
        payPal.setPayerName("John Jones");
        String actual = payPal.getPayerName();
        assertEquals(expected, actual);

    }

    @Test
    public void setPayerNameTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        String expected = "John Jones";
        payPal.setPayerName("John Jones");
        String actual = payPal.getPayerName();
        assertEquals(expected, actual);

    }

    @Test
    public void getEmailTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        String expected = "JJones@yahoo.com";
        payPal.setEmail("JJones@yahoo.com");
        String actual = payPal.getEmail();
        assertEquals(expected, actual);

    }

    @Test
    public void setEmailTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        String expected = "JJones@yahoo.com";
        payPal.setEmail("JJones@yahoo.com");
        String actual = payPal.getEmail();
        assertEquals(expected, actual);

    }

    @Test
    public void getShortDescriptionTest() {
        PayPal payPal = new PayPal(500L, "Roy", "Roy@gmail.com");
        payPal.setPayerName("John Jones");
        payPal.setEmail("JJones@yahoo.com");
        String expected = "Paypal " + payPal.getPayerName() + " " + payPal.getEmail();
        String actual = payPal.getShortDescription();
        assertEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        Payment c = new PayPal(500L, "John Jones", "3567280");
        Payment second = new PayPal(700L, "Tom Ryan", "3884625");
        int expected = -1;
        int actual = c.compareTo(second);
        assertEquals(expected, actual);
    }

}