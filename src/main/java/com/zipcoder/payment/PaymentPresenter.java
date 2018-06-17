package com.zipcoder.payment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PaymentPresenter {

    private Payment[] payments;

    public PaymentPresenter(Payment payment) {
        payments = new Payment[1];
        payments[0] = payment;
    }

    public PaymentPresenter(Payment paymentOne, Payment paymentTwo) {
        payments = new Payment[2];
        payments[0] = paymentOne;
        payments[1] = paymentTwo;
    }

    public PaymentPresenter(Payment paymentOne, Payment paymentTwo, Payment paymentThree) {
        payments = new Payment[3];
        payments[0] = paymentOne;
        payments[1] = paymentTwo;
        payments[2] = paymentThree;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public Payment[] sortPayments() {
        Arrays.sort(payments, new PaymentSortByPayer());
        return payments;
    }

    public String toStringByPayerName() {
        sortPayments();
        String describe = "";
        for (Payment payment : payments) {
            describe += payment.getShortDescription() + "\n";
        }
        return describe;
    }


    public String toStringById() {
        Arrays.sort(payments, (paymentOne, paymentTwo) -> (int) (paymentOne.getId() - paymentTwo.getId()));
        String describe = "";
        for (Payment payment : payments) {
            describe += payment.getShortDescription();
        }
        return describe;
    }
}
