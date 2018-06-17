package com.zipcoder.payment;

public class Main {

    public static void main(String[] args) {

        Payment payPal = new PayPal(500L, "James Jones", "JJ@yahoo.com");
        Payment creditCard = new CreditCard(900L, "Phil Anders", "462008",
                "11", "22");
        Payment check = new Check(234L, "Amy Tuck", "874402", "95720");

        PaymentPresenter presenter = new PaymentPresenter(payPal, check, creditCard);
        System.out.println(presenter.toStringByPayerName());
        System.out.println(presenter.toStringById());

    }
}
