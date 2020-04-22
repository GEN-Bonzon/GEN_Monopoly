package Monopoly.impl;

/**
 * Represents a Die
 * @author Tiffany Bonzon
 */
public class Die {
    private final static int MAX_VALUE = 6;
    private int faceValue;

    /**
     * Rolls the die
     */
    public void roll() {
        faceValue = (int)(Math.random() * MAX_VALUE + 1);
    }

    /**
     * Returns the rolled value
     * @return the rolled value
     */
    public int getFaceValue() {
        return faceValue;
    }
}
