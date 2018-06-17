package com.zipcoder.payment;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PaymentPresenterTest {

    @Test
    public void getPaymentsTest() {
    }

    @Test
    public void sortPaymentsTest() {
    }

    @Test
    public void toStringByPayerNameTest() {
            Payment paypal = new PayPal(4L, "Tamara Mowry", "tamara@mowry.com");
            Payment check = new Check(81L, "Tia Mowry", "11432543", "134344551");
            PaymentPresenter presenter = new PaymentPresenter(paypal, check);
            Arrays.sort(presenter.getPayments(), new PaymentSortByPayer());

            String expected = "Paypal Tamara Mowry tamara@mowry.com\nCheck Tia Mowry ***4551\n";
            String actual = presenter.toStringByPayerName();
            assertEquals(expected, actual);
    }

    @Test
    public void toStringByIdTest() {
        Payment paypal = new PayPal(90L, "Tamara Mowry", "tamara@mowry.com");
        Payment check = new Check(81L, "Tia Mowry", "11432543", "134344551");
        PaymentPresenter presenter = new PaymentPresenter(paypal, check);
        Arrays.sort(presenter.getPayments(), new PaymentSortByPayer());
        String expected = "Check Tia Mowry ***4551\nPaypal Tamara Mowry tamara@mowry.com\n";
        String actual = presenter.toStringById();
        assertEquals(expected, actual);

    }
}