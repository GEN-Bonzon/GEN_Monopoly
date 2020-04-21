package Monopoly.impl;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player player) {
        int w = player.getNetWorth();
        player.reduceCash(Integer.min(200, (w / 10)));
    }
}
