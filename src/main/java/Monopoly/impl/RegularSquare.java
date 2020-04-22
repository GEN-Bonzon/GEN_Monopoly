package Monopoly.impl;

/**
 * Represents a RegularSquare
 * @author Tiffany Bonzon
 */
public class RegularSquare extends Square {
    /**
     * Constructor
     * @param name The square's name
     */
    public RegularSquare(String name) {
        super(name);
    }

    /**
     * Action taken when landing on this square : none
     * @param player Targets the player that landed on this square
     */
    @Override
    public void landedOn(Player player) {}
}
