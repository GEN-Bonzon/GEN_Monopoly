package Monopoly.impl;

public class Die {
    private int faceValue;

    public Die() {
        faceValue = 0;
    }

    public void roll() {
        faceValue = (int)(Math.random() * 6 + 1);
    }

    public int getFaceValue() {
        return faceValue;
    }
}
