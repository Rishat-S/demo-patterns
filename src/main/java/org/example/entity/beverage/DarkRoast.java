package org.example.entity.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE: return .95;
            case VENTI: return .90;
        }
        return 1.;
    }
}
