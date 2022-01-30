package com.sda.javaee9spring;

import org.junit.jupiter.api.Assertions;
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
    @Test
    void recordsTest(){
        Animal animal = new Animal();
        System.out.println(animal);

        Toy plasticGun = new Toy("plastic gun");
        System.out.println(plasticGun);
    }
    @Test
    void equalsTest(){
        Assertions.assertTrue(4 == 4);

        Animal one = new Animal();
        Animal two = new Animal();
        Animal three = one;

        Assertions.assertFalse(one == two);
        Assertions.assertFalse(one.equals(two));


        Toy plasticGun = new Toy("plastic gun");
        Toy plasticGun2 = new Toy("plastic gun");
        Assertions.assertEquals(plasticGun, plasticGun2);

    }
}
record Toy(String name){}
record Child(String name, Toy favouriteToy) {}
record Parent(String name, Child child) {}
class Animal{}
