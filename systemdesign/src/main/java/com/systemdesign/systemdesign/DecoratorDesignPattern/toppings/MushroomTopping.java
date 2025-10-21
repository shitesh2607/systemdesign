package com.systemdesign.systemdesign.DecoratorDesignPattern.toppings;

import com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza.BasePizza;

public class MushroomTopping extends ToppingDecorator{


    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return base.getDescription() + " + Mushroom";
    }

    @Override
    public double getCost() {
        return base.getCost()+20;
    }
}
