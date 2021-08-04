package com.home.heads;

import com.home.abs.RobotParts;

public class SamsungHead extends RobotParts implements IHead {

    public SamsungHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова с логотипом Samsung");
    }
}
