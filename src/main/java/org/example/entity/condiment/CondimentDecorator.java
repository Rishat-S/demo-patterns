package org.example.entity.condiment;

import org.example.entity.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();

}
