package org.example.entity.beverage;

public class Decaf extends Beverage{

    public Decaf() {
        description ="Decaf";
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case GRANDE: return 1.05;
            case VENTI: return .90;
        }
        return 2.05;
    }
}
