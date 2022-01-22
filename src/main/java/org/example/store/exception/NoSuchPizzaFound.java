package org.example.store.exception;

public class NoSuchPizzaFound extends Throwable {
    public NoSuchPizzaFound(String msg) {
        super(msg);
    }
}
