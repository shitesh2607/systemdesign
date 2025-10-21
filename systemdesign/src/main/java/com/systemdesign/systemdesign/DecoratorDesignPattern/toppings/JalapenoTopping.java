package com.systemdesign.systemdesign.DecoratorDesignPattern.toppings;

import com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza.BasePizza;

public class JalapenoTopping extends ToppingDecorator {
    public JalapenoTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return base.getDescription()+" + Jalapeno";
    }

    @Override
    public double getCost() {
        return base.getCost()+30;
    }
}
