package com.designpatterns.behavirol.visitor.shoppingexample;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
