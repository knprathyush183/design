package com.designpatterns.behavirol.chainOfResponsibility.atmdispenser;

public interface DispenseChain {

    void dispense(Currency currency);

    void setNextChain(DispenseChain chain);

}
