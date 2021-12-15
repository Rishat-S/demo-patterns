package org.example.entity.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso " + getSize();
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE: return 1.99;
            case VENTI: return .99;
        }
        return 2.99;
    }
}
