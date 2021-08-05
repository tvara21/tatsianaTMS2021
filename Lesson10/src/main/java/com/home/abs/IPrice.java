package com.home.abs;

public interface IPrice {
    default int getPrice() {
        return 0;
    }
}
