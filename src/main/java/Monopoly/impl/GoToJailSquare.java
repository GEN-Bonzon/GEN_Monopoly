package Monopoly.impl;

/**
 * Represents a GoToJailSquare
 * @author Tiffany Bonzon
 */
public class GoToJailSquare extends Square {
    /**
     * Constructor
     * @param name The square's name
     */
    public GoToJailSquare(String name) {
        super(name);
    }

    /**
     * Action taken when landing on this square : sends player to Jail (square#10)
     * @param player Targets the player that landed on this square
     */
    @Override
    public void landedOn(Player player) {
        Square jail = player.getBoard().getSquare(10);
        player.getPiece().setLocation(jail);
    }
}
