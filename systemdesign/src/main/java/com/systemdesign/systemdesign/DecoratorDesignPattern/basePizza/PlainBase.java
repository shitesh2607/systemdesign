package com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza;

public class PlainBase implements BasePizza{

    @Override
    public double getCost(){
        return 150.00;
    }
    @Override
    public String getDescription(){
        return "Plain Cheese Pizza";
    }
}
