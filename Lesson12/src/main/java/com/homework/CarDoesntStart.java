package com.homework;

public class CarDoesntStart extends Exception {
    public CarDoesntStart() {
    }

    public CarDoesntStart(String message) {
        super(message);
    }

    public CarDoesntStart(String message, Throwable cause) {
        super(message, cause);
    }

    public CarDoesntStart(Throwable cause) {
        super(cause);
    }

    public CarDoesntStart(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
