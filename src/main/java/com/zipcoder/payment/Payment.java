package com.zipcoder.payment;

public interface Payment extends  Comparable<Payment>{

    Long getId();

    String getPayerName();

    String getShortDescription();
}
