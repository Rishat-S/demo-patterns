package org.example.behavior.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quaaaack");
    }
}
