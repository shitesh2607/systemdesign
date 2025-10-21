package com.systemdesign.systemdesign.Factory_AbstractFactoryPattern.SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {

        BurgerFactory burgerFactory=new BurgerFactory();
        String order1="CHICKENBURGER";
        String order2="PREMIUMBURGER";
        String order3="PROTEINBURGER";
        Burger burger=burgerFactory.creteBurger(order2);
        burger.prepare();
    }
}
