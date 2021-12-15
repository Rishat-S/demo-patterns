package org.example.entity.beverage;

import org.example.entity.beverage.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
