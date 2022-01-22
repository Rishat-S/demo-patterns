package org.example.store;

import org.example.entity.Pizza;
import org.example.store.exception.NoSuchPizzaFound;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type) throws NoSuchPizzaFound;

    public Pizza orderPizza(String type) throws NoSuchPizzaFound {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
