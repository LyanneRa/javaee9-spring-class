package com.sda.javaee9spring.homework.car;

import org.springframework.stereotype.Service;

@Service
public class Car {
    private final Wheel firstWheel;
    private final Wheel secondWheel;
    private final Wheel thirdWheel;
    private final Wheel fourthWheel;
    private final CarBody carBody;
    private final Engine engine;
    private final EngineBody engineBody;

    public Car(Wheel firstWheel, Wheel secondWheel, Wheel thirdWheel, Wheel fourthWheel, CarBody carBody, Engine engine, EngineBody engineBody) {
        this.firstWheel = firstWheel;
        this.secondWheel = secondWheel;
        this.thirdWheel = thirdWheel;
        this.fourthWheel = fourthWheel;
        this.carBody = carBody;
        this.engine = engine;
        this.engineBody = engineBody;
    }
}
