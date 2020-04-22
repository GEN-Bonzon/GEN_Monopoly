package Monopoly.impl;

/**
 * Represents a Square (abstract)
 * @author Tiffany Bonzon
 */
public abstract class Square {
    private String name;

    /**
     * Constructor
     * @param name The square's name
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * Returns the Square's name
     * @return the Square's name
     */
    public String getName() {
        return name;
    }

    /**
     * Action taken when landing on this square
     * @param player Targets the player that landed on this square
     */
    public abstract void landedOn(Player player);
}
