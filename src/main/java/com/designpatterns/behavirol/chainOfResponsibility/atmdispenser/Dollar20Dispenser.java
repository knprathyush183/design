package com.designpatterns.behavirol.chainOfResponsibility.atmdispenser;

public class Dollar20Dispenser implements DispenseChain{

    private DispenseChain nextChain;

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20) {
            int num = currency.getAmount()/20;
            int rem = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ notes");
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
