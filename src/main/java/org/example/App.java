package org.example;

import org.example.entity.Pizza;
import org.example.store.NYPizzaStyleStore;
import org.example.store.PizzaStore;
import org.example.store.exception.NoSuchPizzaFound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Pizza pizza;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PizzaStore nyPizzaStore = new NYPizzaStyleStore();

       while (true) {
           try {
               System.out.println("Enter the name of the pizza");
               String input = br.readLine();
               if (input.equals("exit")) {
                   System.out.println("Exiting the program");
                   break;
               }

               pizza = nyPizzaStore.orderPizza(input);
               System.out.println(pizza.toString());

           } catch (NoSuchPizzaFound | IOException e) {
               System.out.println(e.getMessage());
           }
       }

    }
}
