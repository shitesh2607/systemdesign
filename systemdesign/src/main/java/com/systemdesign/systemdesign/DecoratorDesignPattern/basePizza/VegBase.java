package com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza;

public class VegBase implements BasePizza{

    @Override
    public double getCost(){
        return 500.00;
    }

    @Override
    public String getDescription(){
        return "Vegetable Pizza";
    }
}
