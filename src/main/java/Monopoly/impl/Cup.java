package Monopoly.impl;

/**
 * Represents the cup containing the Dice
 * @author Tiffany Bonzon
 */
public class Cup {
    private int total;
    private Die dice[];

    /**
     * Constructor
     * @param numberOfDice The number of dice in the cup
     */
    public Cup(int numberOfDice) {
        dice = new Die[numberOfDice];

        for(int i = 0; i < numberOfDice; ++i) {
            dice[i] = new Die();
        }
    }

    /**
     * Rolls the dice
     */
    public void roll() {
        total = 0;
        for(Die d : dice) {
            d.roll();
            total += d.getFaceValue();
        }
    }

    /**
     * Returns the total obtained by the roll
     * @return the total obtained by the roll
     */
    public int getTotal() {
        return total;
    }
}
