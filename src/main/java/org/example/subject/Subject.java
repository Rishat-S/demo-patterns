package org.example.subject;

public interface Subject {
    void registerObserver();

    void removeObserver();

    void notifyObservers();
}
