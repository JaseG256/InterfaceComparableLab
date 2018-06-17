package com.zipcoder.payment;

public class Check implements Payment{

    private Long id;
    private String payerName;
    private String routingNumber;
    private  String accountNumber;

    public Check(Long id, String payerName, String accountNumber, String routingNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.payerName = payerName;
        this.routingNumber = routingNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getShortDescription() {

        return "Check " + payerName + " ****" + accountNumber.substring(accountNumber.length() - 4) + "\n";
    }



        public int compareTo(Payment secondCheck) {
            int comparison;
            if (getShortDescription().compareTo(secondCheck.getShortDescription()) == 0) {
                comparison =  0;
            } else if (getShortDescription().compareTo(secondCheck.getShortDescription()) < 0) {
                comparison = -1;
            } else {
                comparison = 1;
            }
            return comparison;
        }

    }

