package com.home.hands;

import com.home.abs.RobotParts;

public class SamsungHand extends RobotParts implements IHand {

    public SamsungHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Samsung");
    }
}