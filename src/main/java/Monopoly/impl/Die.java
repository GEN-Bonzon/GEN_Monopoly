package Monopoly.impl;

public class Die {
    private final static int MAX_VALUE = 6;
    private int faceValue;

    public void roll() {
        faceValue = (int)(Math.random() * MAX_VALUE + 1);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
