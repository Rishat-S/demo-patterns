package org.example.entity.ny;

import org.example.entity.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(String type) {
        setName("NY style sauce and " + type + " pizza");
        setDough("Thin Crust Dough");
        addToppingToToppings("Cheese");
    }

}
