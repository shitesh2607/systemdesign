package com.systemdesign.systemdesign.Factory_AbstractFactoryPattern.SimpleFactoryPattern;

public class ChickenBurger extends Burger{

    @Override
    public void prepare() {
        System.out.println("Your order has been registered.Preparing chicken burger for you.");
    }
}
