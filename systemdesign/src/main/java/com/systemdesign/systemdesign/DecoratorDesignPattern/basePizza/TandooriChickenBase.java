package com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza;

public class TandooriChickenBase implements BasePizza{

    @Override
    public double getCost(){
        return 300.00F;
    }

    @Override
    public String getDescription(){
        return "TandooriPizza";
    }

}
