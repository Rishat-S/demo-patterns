package org.example.entity.condiment;

import org.example.entity.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE: return beverage.cost() + .15;
            case VENTI: return beverage.cost() + .10;
        }
        return beverage.cost() + .20;
    }
}
