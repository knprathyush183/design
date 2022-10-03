package com.designpatterns.behavirol.visitor.shoppingexample;

public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[] {
                new Book(20, "1234"),
                new Book(100, "3456"),
                new Fruit("Apple", 2, 35),
                new Fruit("Banana", 4, 32)
        };
        int total = calculatePrice(itemElements);
        System.out.println("total cost : " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item: items) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}
