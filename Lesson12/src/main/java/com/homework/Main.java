package com.homework;

public class Main {
    public static void main(String[] args) {
        Startable car1 = new Car("Audi", 250, 10000);
        Startable car2 = new Car("BMW", 230, 9500);
        Startable car3 = new Car("Opel", 180, 7000);
        Startable car4 = new Car();
        Startable[] vehicles = {car1, car2, car3, car4};

        try {
            method(vehicles);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause() != null ? exception.getCause().getMessage() : "");
            exception.printStackTrace();
        }

    }

    static void method(Startable[] vehicles) throws Exception {
        for (Startable startable : vehicles) {
            try {
                startable.start();
            } catch (CarDoesntStart exception) {
                throw exception;
            } catch (IllegalArgumentException exception2) {
                System.out.println(exception2.getMessage());
            } catch (Exception e) {
                System.out.println("2 " + e.getMessage());
            }
        }
    }
}