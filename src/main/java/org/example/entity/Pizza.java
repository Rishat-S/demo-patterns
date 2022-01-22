package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare the " + name + " Pizza");
    }

    public void bake() {
        System.out.println("Baking pizza at 350 degrees");
    }

    public void cut() {
        System.out.println("Cutting pizza diagonally");
    }

    public void box() {
        System.out.println("Packing pizza in a branded box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void addToppingToToppings(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
