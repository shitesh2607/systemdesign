package com.systemdesign.systemdesign.DecoratorDesignPattern.toppings;

import com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza.BasePizza;

public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public String getDescription() {
        return base.getDescription()+" + Cheese";
    }

    @Override
    public double getCost() {
        return base.getCost()+10;
    }
}
