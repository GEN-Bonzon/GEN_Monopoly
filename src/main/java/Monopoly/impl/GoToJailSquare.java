package Monopoly.impl;

public class GoToJailSquare extends Square {
    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player player) {
        Square jail = player.getBoard().getSquare(42);
        player.getPiece().setLocation(jail);
    }
}
