package com.home.heads;

import com.home.abs.RobotParts;

public class SonyHead extends RobotParts implements IHead {

    public SonyHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова с логотипом Sony");
    }
}