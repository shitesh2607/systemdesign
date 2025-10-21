package com.systemdesign.systemdesign.DecoratorDesignPattern.toppings;

import com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza base;

    public ToppingDecorator(BasePizza basePizza){
        this.base=basePizza;
    }
}
