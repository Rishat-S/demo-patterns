package org.example.entity.condiment;

import org.example.entity.beverage.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE: return beverage.cost() + .10;
            case VENTI: return beverage.cost() + .05;
        }
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
