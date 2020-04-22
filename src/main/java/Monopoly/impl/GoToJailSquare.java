package Monopoly.impl;

public class GoToJailSquare extends Square {
    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player player) {
        Square jail = player.getBoard().getSquare(10);
        player.getPiece().setLocation(jail);
    }

    @Override
    public String getName() {
        return super.getName() + "(--> Jail)";
    }
}
