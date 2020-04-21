package Monopoly.impl;

import java.util.ArrayList;

public class MonopolyGame {
    private final static int MAX_ROUNDS = 20;
    private Board board;
    private ArrayList<Die> dice = new ArrayList<>(2);
    private ArrayList<Player> players;

    public void playGame() {
        for(int i = 0; i < MAX_ROUNDS; ++i) {
            for(Player p : players) {
                p.takeTurn();
            }
        }
    }

}
