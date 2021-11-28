package org.example;

import org.example.behavior.fly.FlyRocketPowered;
import org.example.entity.Duck;
import org.example.entity.MallardDuck;
import org.example.entity.ModelDuck;

public class App {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();

        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
