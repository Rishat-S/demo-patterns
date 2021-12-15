package org.example.entity.beverage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}
    Size size = Size.VENTI;

    protected String description = "Unknown Beverage";

    public abstract double cost();
}

