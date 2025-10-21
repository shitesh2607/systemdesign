package com.systemdesign.systemdesign.Factory_AbstractFactoryPattern.SimpleFactoryPattern;

public class BurgerFactory {

    Burger creteBurger(String burger){

        return switch (burger) {
            case "PREMIUMBURGER" -> new PremiumBurger();
            case "CHICKENBURGER" -> new ChickenBurger();
            case "PROTEINBURGER" -> new ProteinBurger();
            default -> null;
        };
    }
}
