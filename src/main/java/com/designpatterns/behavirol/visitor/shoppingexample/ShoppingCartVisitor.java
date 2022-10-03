package com.designpatterns.behavirol.visitor.shoppingexample;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
