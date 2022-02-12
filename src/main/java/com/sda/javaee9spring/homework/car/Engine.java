package com.sda.javaee9spring.homework.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private final EngineHead engineHead;

    @Autowired
    public Engine(EngineHead engineHead) {
        this.engineHead = engineHead;
    }
}
