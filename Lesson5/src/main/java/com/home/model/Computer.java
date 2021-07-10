package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String processor;
    public int ram;
    public int hdd;
    public int limitOnOff;
    int countOnOff = 0;

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

    public boolean ok() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner console = new Scanner(System.in);
        int user = console.nextInt();

        Random random = new Random();
        int rand = random.nextInt(2);
        System.out.println("check: " + rand);

        System.out.println("count полных циклов работы: " + countOnOff);
        return user == rand;
    }

    public void on() {
        if (ok() == true) {
            off();
        } else {
            System.out.println("Компьютер сгорел!");
        }


    }

    public void off() {
        countOnOff++;

        if (ok() == true && countOnOff < limitOnOff) {
            on();
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

}


