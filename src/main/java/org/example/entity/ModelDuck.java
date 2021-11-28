package org.example.entity;

import org.example.behavior.fly.FlyNoWay;
import org.example.behavior.quack.Quack;

public class ModelDuck extends Duck {


    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am MODEL of Duck");
    }
}
