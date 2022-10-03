package com.designpatterns.behavirol.chainOfResponsibility.atmdispenser;

import java.util.Scanner;

public class AtmDispenseChain {

    private DispenseChain c1;

    public AtmDispenseChain() {
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        AtmDispenseChain atmDispenseChain = new AtmDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Please enter amount in multiples of 10$");
                return;
            }
            atmDispenseChain.c1.dispense(new Currency(amount));
        }
    }
}
