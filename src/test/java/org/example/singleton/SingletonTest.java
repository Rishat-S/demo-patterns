package org.example.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    public void testSingleton() {
        Assertions.assertSame(Singleton.MY_SINGLETON, Singleton.MY_SINGLETON);
    }

}