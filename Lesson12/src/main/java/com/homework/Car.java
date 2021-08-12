package com.homework;

import java.sql.SQLOutput;
import java.util.Random;

public class Car implements Startable {
    private String brand;
    private int speed;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("Цена не может быть меньше или равно 0! Проверьте данные");
        } else {
            this.price = price;
        }
    }

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public void start() throws Exception {
        Random random = new Random();
        int start = random.nextInt(21);
        if (brand != null || speed != 0 || price != 0) {
            if (start % 2 == 0) {
                System.out.println("Автомобиль " + brand + " завелся!");
            } else {
                throw new CarDoesntStart("Автомобиль " + brand + " не завелся!");
            }
        } else {
            throw new IllegalArgumentException("данные автомобиля некорректные");
        }
    }
}