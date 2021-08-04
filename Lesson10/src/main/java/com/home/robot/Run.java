package com.home.robot;

import com.home.hands.IHand;
import com.home.hands.SamsungHand;
import com.home.hands.SonyHand;
import com.home.hands.ToshibaHand;
import com.home.heads.IHead;
import com.home.heads.SamsungHead;
import com.home.heads.SonyHead;
import com.home.heads.ToshibaHead;
import com.home.legs.ILeg;
import com.home.legs.SamsungLeg;
import com.home.legs.SonyLeg;
import com.home.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHead[] heads = new IHead[3];
        heads[0] = new SamsungHead(5300);
        heads[1] = new SonyHead(1025);
        heads[2] = new ToshibaHead(4900);
        IHand[] hands = new IHand[3];
        hands[0] = new ToshibaHand(2560);
        hands[1] = new SamsungHand(4050);
        hands[2] = new SonyHand(3600);
        ILeg[] legs = new ILeg[3];
        legs[0] = new SonyLeg(5030);
        legs[1] = new SamsungLeg(1800);
        legs[2] = new ToshibaLeg(3760);

        IRobot[] robots = new IRobot[3];
        int maxPrice = Integer.MIN_VALUE;
        int maxPriceIndex = -1;
        for (int i = 0; i < 3; i++) {
            robots[i] = new Robot(heads[i], hands[i], legs[i]);
            robots[i].action();
            System.out.println();
            int price = robots[i].getPrice();
            if (price > maxPrice) {
                maxPriceIndex = i;
                maxPrice = price;
            }
        }
        Robot maxPriceRobot = (Robot) robots[maxPriceIndex];
        System.out.printf("Самый дорогой робот стоит %d у.е. и состоит из головы %s, рук %s и ног %s \n", maxPrice, maxPriceRobot.getHead().getClass().getSimpleName(),
                maxPriceRobot.getHand().getClass().getSimpleName(), maxPriceRobot.getLeg().getClass().getSimpleName());
    }
}