package com.systemdesign.systemdesign.Factory_AbstractFactoryPattern.SimpleFactoryPattern;

public class PremiumBurger extends Burger{
    @Override
    public void prepare() {
        System.out.println("Your order has been registered.Preparing premium burger for you.");
    }
}
