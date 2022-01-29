package com.sda.javaee9spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Javaee9SpringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void dependencyInjectionFirstTrial() {
        Toy plasticGun = new Toy("plastic gun");
        Child john = new Child("John", plasticGun);
        Parent jason = new Parent("Jason", john);
    }
}
record Toy(String name){}
record Child(String name, Toy favouriteToy) {}
record Parent(String name, Child child) {}
