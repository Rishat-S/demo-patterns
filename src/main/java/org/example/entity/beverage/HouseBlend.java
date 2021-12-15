package org.example.entity.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE: return .95;
            case VENTI: return .90;
        }
        return .99;
    }
}
