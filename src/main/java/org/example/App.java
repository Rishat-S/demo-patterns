package org.example;

import org.example.entity.beverage.Beverage;
import org.example.entity.beverage.Espresso;
import org.example.entity.condiment.Milk;
import org.example.entity.condiment.Mocha;
import org.example.entity.condiment.Whip;

public class App {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Milk(new Whip(new Mocha(new Espresso())));
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());


    }
}
