package com.zipcoder.payment;

public class CreditCard implements Payment{
    
    private Long id;
    private String payerName;
    private String number;
    private String expiredMonth;
    private String expiredYear;

    public CreditCard(Long id, String payerName, String number, String expiredMonth, String expiredYear) {
        this.id = id;
        this.payerName = payerName;
        this.number = number;
        this.expiredMonth = expiredMonth;
        this.expiredYear = expiredYear;
    }

    public void setId(long id) {
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

    public String getShortDescription() {
        String lastFour = id.toString().substring(id.toString().length() - 3);
        return "CC" + payerName + lastFour + " " + expiredMonth + "/" + expiredYear + "\n";
    }
    
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setExpiredMonth(String expiredMonth) {
        this.expiredMonth = expiredMonth;
    }

    public String getExpiredMonth( ) {
        return this.expiredMonth;
    }

    public void setExpiredYear(String expiredYear) {
        this.expiredYear = expiredYear;
    }

    public String getExpiredYear() {
        return expiredYear;
    }

    public int compareTo(Payment payment) {
        int comparison;
        if (id.compareTo(payment.getId()) == 0) {
            comparison =  0;
        } else if (id.compareTo(payment.getId())  < 0) {
            comparison = -1;
        } else {
            comparison = 1;
        }
            return  comparison;
        }
    }

