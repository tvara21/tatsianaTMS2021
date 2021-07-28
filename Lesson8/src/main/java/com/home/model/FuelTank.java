package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FuelTank {
    private final int volume;
    private double fuelLevel;

    public FuelTank(int volume) {
        this.volume = volume;
    }
}
