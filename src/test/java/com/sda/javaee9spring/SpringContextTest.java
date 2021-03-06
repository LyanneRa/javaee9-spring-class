package com.sda.javaee9spring;

import com.sda.javaee9spring.component.MyFirstSpringComponent;
import com.sda.javaee9spring.component.SecondComponent;
import com.sda.javaee9spring.controller.FirstController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpringContextTest {
    @Autowired
    private FirstController myFirstController;

    @Test
    void checkFirstControllerReference(){
        assertNotNull(myFirstController);
        String firstPageName = myFirstController.firstPage();
        assertEquals("home-page", firstPageName);
    }
    @Autowired
    private MyFirstSpringComponent myFirstSpringComponent;
    @Test
    void checkMyFirstSpringComponentReference(){
        assertNotNull(myFirstSpringComponent);
    }
    @Autowired
    private MyFirstSpringComponent myFirstSpringComponentSecondReference;
    @Test
    void manyObjectsOfTheSameTypeTest(){
        assertSame(myFirstSpringComponent, myFirstSpringComponentSecondReference);
    }
    @Autowired
    private SecondComponent secondComponent;
    @Autowired
    private SecondComponent anotherSecondComponent;
    @Test
    void objectsOfTheSameTypeTest(){
        assertNotSame(secondComponent, anotherSecondComponent);
    }
}
