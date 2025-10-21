package com.systemdesign.systemdesign.DecoratorDesignPattern;

import com.systemdesign.systemdesign.DecoratorDesignPattern.basePizza.PlainBase;
import com.systemdesign.systemdesign.DecoratorDesignPattern.toppings.CheeseTopping;

public class Main {

    public static void main(String[] args) {
        // Create a plain pizza
        PlainBase plainBase=new PlainBase();
        System.out.println("Order 1:" + plainBase.getDescription() +" , Cost: "+plainBase.getCost());

        // Add toppings to the PlainPizza - Extra Cheese Only
        CheeseTopping cheeseTopping= new CheeseTopping(plainBase);
        System.out.println("Order 2:"+cheeseTopping.getDescription() + " "+ cheeseTopping.getCost());

    }
}
