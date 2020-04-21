package Monopoly.impl;

import java.util.ArrayList;

public class Cup {
    private int total;
    private Die dice[];

    public Cup(int numberOfDice) {
        dice = new Die[numberOfDice];

        for(int i = 0; i < numberOfDice; ++i) {
            dice[i] = new Die();
        }
    }

    public void roll() {
        total = 0;
        for(Die d : dice) {
            d.roll();
            total += d.getFaceValue();
        }
    }

    public int getTotal() {
        return total;
    }
}
