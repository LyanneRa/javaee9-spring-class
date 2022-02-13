package com.sda.javaee9spring.homework.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Engine {
    private final EngineHead engineHead;
    private final EngineBody engineBody;

    @Autowired
    public Engine(EngineHead engineHead, EngineBody engineBody) {
        this.engineHead = engineHead;
        this.engineBody = engineBody;
        log.info("Engine was created");
    }
}
