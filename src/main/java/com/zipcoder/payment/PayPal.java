package com.zipcoder.payment;

public class PayPal implements Payment{

    private long id;
    private String payerName;
    private String email;

    public PayPal(long id, String payerName, String email) {
        this.id = id;
        this.payerName = payerName;
        this.email = email;
    }

    public void setId(long id) { this.id = id; }

    public Long getId() { return id; }

    public String getPayerName() { return payerName; }

    public void setPayerName(String payerName) { this.payerName = payerName; }

    public void setEmail(String email) { this.email = email; }

    public String getEmail() { return email; }

    public String getShortDescription() {

        return "Paypal " + payerName + " " +  email + "\n";
    }

    public int compareTo(Payment payment) {
        int comparison;
        if (getShortDescription().compareTo(payment.getShortDescription()) == 0) {
            comparison =  0;
        } else if (getShortDescription().compareTo(payment.getShortDescription()) < 0) {
            comparison = -1;
        } else {
            comparison = 1;
        }
        return comparison;
    }
}
