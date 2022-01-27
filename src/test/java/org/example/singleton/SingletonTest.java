package org.example.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        Assertions.assertTrue(singleton1 == singleton);
    }

}