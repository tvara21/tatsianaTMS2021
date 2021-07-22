package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;
@Setter
@Getter


public class Computer {
    private String processor;
    private int ram;
    private int hdd;
    private int limitOnOff;

    private int countOnOff;
    private Scanner console = new Scanner(System.in);
    private Random random = new Random();

    public Computer(String processor, int ram, int hdd, int limitOnOff) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.limitOnOff = limitOnOff;
    }

    public void description() {
        System.out.println("процессор: " + processor);
        System.out.println("оперативка (GB): " + ram);
        System.out.println("жесткий диск (GB): " + hdd);
        System.out.println("ресурс полных циклов работы: " + limitOnOff);

    }

    private boolean check() {
        int user = console.nextInt();
        int rand = random.nextInt(2);
        System.out.println("check: " + rand);
        System.out.println("count полных циклов работы: " + countOnOff);
        return user == rand;
    }

    public void on() {
        System.out.println("ON: Внимание! Введите 0 или 1");
        if (check()) {
            off();
        } else {
            System.out.println("Компьютер сгорел!");
        }

    }

    private void off() {
        System.out.println("OFF: Внимание! Введите 0 или 1");
        countOnOff++;

        if (check() && countOnOff < limitOnOff) {
            on();
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

}


