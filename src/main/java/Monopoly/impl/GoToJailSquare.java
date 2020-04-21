package Monopoly.impl;

public class GoToJailSquare extends Square {
    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player player) {
        //go to jail
    }
}
