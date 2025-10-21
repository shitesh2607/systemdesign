package com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza;

public class ChickenBase implements BasePizza{

    @Override
    public double getCost(){
        return 100.00;
    }

    @Override
    public String getDescription(){
        return "Chicken Base";
    }
}
