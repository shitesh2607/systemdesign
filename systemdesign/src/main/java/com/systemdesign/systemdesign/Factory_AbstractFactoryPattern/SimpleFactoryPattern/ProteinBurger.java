package com.systemdesign.systemdesign.Factory_AbstractFactoryPattern.SimpleFactoryPattern;

public class ProteinBurger extends Burger{

    @Override
    public void prepare() {
        System.out.println("Your order has been registered.Preparing protein burger for you.");
    }
}
