package Monopoly.impl;

/**
 * Represents an IncomeTaxSquare
 * @author Tiffany Bonzon
 */
public class IncomeTaxSquare extends Square {
    /**
     * Constructor
     * @param name The square's name
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    /**
     * Action taken when landing on this square : deduce from the balance
     * @param player Targets the player that landed on this square
     */
    @Override
    public void landedOn(Player player) {
        int w = player.getNetWorth();
        player.reduceCash(Integer.min(200, (w / 10)));
    }
}
