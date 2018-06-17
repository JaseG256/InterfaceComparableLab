package com.zipcoder.payment;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void getIdTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");
        Long expected = 500L;
        card.setId(expected);
        Long actual = card.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void setIdTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        Long expected = 500L;
        card.setId(expected);
        Long actual = card.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void getPayerNameTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "John";
        card.setPayerName(expected);
        String actual = card.getPayerName();
        assertEquals(expected, actual);
    }

    @Test
    public void setPayerNameTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "John";
        card.setPayerName(expected);
        String actual = card.getPayerName();
        assertEquals(expected, actual);
    }

    @Test
    public void getNumberTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "55724592933";
        card.setNumber(expected);
        String actual = card.getNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void setNumberTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "55724592933";
        card.setNumber(expected);
        String actual = card.getNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getExpiredMonthTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "10";
        card.setExpiredMonth("10");
        String actual = card.getExpiredMonth();
        assertEquals(expected, actual);
    }

    @Test
    public void setExpiredMonthTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "10";
        card.setExpiredMonth("10");
        String actual = card.getExpiredMonth();
        assertEquals(expected, actual);
    }

    @Test
    public void getExpiredYearTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "2021";
        card.setExpiredYear(expected);
        String actual = card.getExpiredYear();
        assertEquals(expected, actual);

    }

    @Test
    public void setExpiredYearTest() {
        CreditCard card = new CreditCard(500L, "Ron", "39277","03", "20");        String expected = "2021";
        card.setExpiredYear(expected);
        String actual = card.getExpiredYear();
        assertEquals(expected, actual);

    }

    @Test
    public void compareToTest() {
        Payment card = new CreditCard(500L, "Ron", "39277","03", "20");
        Payment second = new CreditCard(700L, "Tom Ryan", "3884625", "10", "18");
        int expected = -1;
        int actual = card.compareTo(second);
        assertEquals(expected, actual);
    }
}