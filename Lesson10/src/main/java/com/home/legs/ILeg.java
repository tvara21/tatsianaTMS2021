package com.home.legs;
import com.home.abs.IPrice;

public interface ILeg extends IPrice {
    void step();
}
