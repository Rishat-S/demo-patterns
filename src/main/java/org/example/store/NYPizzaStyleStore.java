package org.example.store;

import org.example.entity.Pizza;
import org.example.entity.ny.NYStyleCheesePizza;
import org.example.store.exception.NoSuchPizzaFound;

public class NYPizzaStyleStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) throws NoSuchPizzaFound {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza("cheese");
        } else {
            throw new NoSuchPizzaFound("Pizza not found");
        }
    }
}
