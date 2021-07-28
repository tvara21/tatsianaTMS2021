package com.home.service;

import com.home.model.Car;
import com.home.model.FuelTank;

import java.util.Random;

public class CarServiceImpl implements CarService {
    private final Car car;
    private final EngineService engineService;
    private final FuelService fuelService;

    public CarServiceImpl(Car car) {
        this.car = car;
        this.engineService = new EngineServiceImpl(car.getEngine());
        this.fuelService = new FuelServiceImpl(car.getFuelTank());

    }

    @Override
    public boolean isMoving() {
        return car.isMoving();
    }

    @Override
    public void refueling() {
        fuelService.refuel();

    }

    @Override
    public void go() {
        System.out.println("Поехали!");
        if (engineService.isRunning()) {
            car.setMoving(true);
            System.out.println(" --> Автомобиль поехал");
        } else {
            System.out.println(" --> Не могу поехать: сначала заведите двигатель");
        }

    }

    @Override
    public void stop() {
        System.out.println("Стой!");
        if (isMoving()) {
            car.setMoving(false);

            Random random = new Random();
            int distance = random.nextInt(99) + 1;
            int maxPossibleDistance = (int) (car.getFuelTank().getFuelLevel() / car.getFuelConsumptionPerKm());

            if (distance > maxPossibleDistance) {
                car.setDistance(maxPossibleDistance);
                int totalDistance = car.getTotalDistance() + car.getDistance();
                car.setTotalDistance(totalDistance);
                car.getFuelTank().setFuelLevel(car.getFuelTank().getFuelLevel() - car.getFuelConsumptionPerKm() * car.getDistance());
                System.out.println(" --> Автомобиль проехал " + car.getDistance() + " км и заглох, так как закончился бензин. Всего проехал: " + car.getTotalDistance());
                car.getEngine().setRunning(false);

            } else {
                car.setDistance(distance);
                int totalDistance = car.getTotalDistance() + car.getDistance();
                car.setTotalDistance(totalDistance);
                car.getFuelTank().setFuelLevel(car.getFuelTank().getFuelLevel() - car.getFuelConsumptionPerKm() * car.getDistance());
                System.out.println(" --> Автомобиль проехал " + car.getDistance() + " км и остановился. Всего проехал: " + car.getTotalDistance() + "км, осталось бензина: " + car.getFuelTank().getFuelLevel() + " л");
            }

        } else {
            System.out.println("Не могу остановиться: автомобиль и так уже стоит");
        }

    }

    @Override
    public void startEngine() {
        System.out.println("Запускай двигатель!");
        if (!engineService.isRunning() && !fuelService.isEmpty()) {
            engineService.start();
        } else if (engineService.isRunning()) {
            System.out.println(" --> Двигатель уже запущен");
        } else if (fuelService.isEmpty())
            System.out.println(" --> Не могу запустить двигатель: сначала заправьте автомобиль");
    }


    @Override
    public void stopEngine() {
        System.out.println("Выключай двигатель!");
        if (engineService.isRunning() && !isMoving()) {
            engineService.stop();
        } else if (!engineService.isRunning()) {
            System.out.println(" --> Не могу выключить двигатель: он и так не заведен");
        } else if (isMoving())
            System.out.println(" --> Сначала остановитесь");
    }

}