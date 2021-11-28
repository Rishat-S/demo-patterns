package org.example.entity;

import org.example.behavior.fly.FlyWithWings;
import org.example.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Display Mallard");
    }
}
