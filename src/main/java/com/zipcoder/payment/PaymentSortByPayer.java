package com.zipcoder.payment;

import java.util.Comparator;

public class PaymentSortByPayer implements Comparator<Payment> {

    public int compare(Payment paymentOne, Payment paymentTwo) {
        int comparison;
        if (paymentOne.getPayerName().compareTo(paymentTwo.getPayerName()) == 0) {
            comparison = 0;
        } else if (paymentOne.getPayerName().compareTo(paymentTwo.getPayerName()) < 0) {
            comparison = -1;
        } else {
            comparison = 1;
        }
        return comparison;
    }
}
