package Monopoly.impl;

/**
 * Represents a GoSquare
 * @author Tiffany Bonzon
 */
public class GoSquare extends Square {
    /**
     * Constructor
     * @param name The square's name
     */
    public GoSquare(String name) {
        super(name);
    }

    /**
     * Action taken when landing on this square : add 200 to the balance
     * @param player Targets the player that landed on this square
     */
    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
