package com.designpatterns.behavirol.chainOfResponsibility.atmdispenser;

public class Dollar10Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10) {
            int num = currency.getAmount()/10;
            int rem = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ notes");
            if (rem != 0) {
                this.nextChain.dispense(new Currency(rem));
            }
        } else {
            this.nextChain.dispense(currency);
        }
    }

    @Override
    public void setNextChain(DispenseChain chain) {
        this.nextChain = chain;
    }
}
