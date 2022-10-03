package com.designpatterns.behavirol.strategy.paymentexample;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234", 123);
        Item item2 = new Item("2345", 23);
        Item item3 = new Item("3456", 230);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));

        shoppingCart.removeItem(item2);
        shoppingCart.addItem(item3);

        shoppingCart.pay(new CreditCardStrategy("MSD", "1234654327654", 111, "12/15"));

    }
}
