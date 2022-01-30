package org.example.remote;

public enum Buttons {
    FIRST(0),
    SECOND(1),
    THIRD(2),
    FOURTH(3),
    FIFTH(4),
    SIXTH(5),
    SEVENTH(6);

    private final int value;

    Buttons(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}