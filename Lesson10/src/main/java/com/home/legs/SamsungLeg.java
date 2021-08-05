package com.home.legs;

import com.home.abs.RobotParts;

public class SamsungLeg extends RobotParts implements ILeg {

    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога с логотипом Samsung сделала шаг");
    }
}
