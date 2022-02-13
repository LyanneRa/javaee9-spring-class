package com.sda.javaee9spring.homework.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public record Car(Wheel firstWheel,
                  Wheel secondWheel,
                  Wheel thirdWheel,
                  Wheel fourthWheel,
                  CarBody carBody,
                  Engine engine) {
   /* public Car(Wheel firstWheel, Wheel secondWheel, Wheel thirdWheel, Wheel fourthWheel, CarBody carBody, Engine engine) {
        this.firstWheel = firstWheel;
        this.secondWheel = secondWheel;
        this.thirdWheel = thirdWheel;
        this.fourthWheel = fourthWheel;
        this.carBody = carBody;
        this.engine = engine;

        log.info("Car was created"); }*/

    public Car {
        log.info("Car was created");
    }
}
