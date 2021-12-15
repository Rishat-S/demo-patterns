package org.example;

import org.example.entity.beverage.Beverage;
import org.example.entity.beverage.Espresso;
import org.example.entity.condiment.Mocha;
import org.example.entity.condiment.Whip;

public class App {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());


    }
}
