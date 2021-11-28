package org.example.behavior.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am can't fly");
    }
}
