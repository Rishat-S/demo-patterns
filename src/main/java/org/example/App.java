package org.example;

import org.example.entity.beverage.Beverage;
import org.example.entity.beverage.DarkRoast;
import org.example.entity.beverage.Espresso;
import org.example.entity.beverage.HouseBlend;
import org.example.entity.condiment.Milk;
import org.example.entity.condiment.Mocha;
import org.example.entity.condiment.Soy;
import org.example.entity.condiment.Whip;

public class App {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
