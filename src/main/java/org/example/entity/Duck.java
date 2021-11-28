package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.example.behavior.fly.FlyBehavior;
import org.example.behavior.quack.QuackBehavior;

@AllArgsConstructor
@Setter
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
