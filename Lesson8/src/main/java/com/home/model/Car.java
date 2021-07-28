package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private int distance;
    private int totalDistance;
    private final double fuelConsumptionPerKm = 0.5;
    private final Engine engine;
    private FuelTank fuelTank;
    private boolean isMoving;

    public Car(Engine engine) {
        this.engine = engine;
    }


}
