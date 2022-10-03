package com.designpatterns.behavirol.strategy.paymentexample;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private int cvv;
    private String expiryDate;

    public CreditCardStrategy(String name, String cardNumber, int cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Paid with credit card");
    }
}
