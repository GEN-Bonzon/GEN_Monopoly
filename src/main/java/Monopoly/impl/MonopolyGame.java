package Monopoly.impl;

import java.util.ArrayList;

public class MonopolyGame {
    private final static int MAX_ROUNDS = 20;

    private int roundCnt;
    private Board board;
    private ArrayList<Die> dice;
    private ArrayList<Player> players;

    MonopolyGame(int nbPlayer) {
        if(nbPlayer < 2) {
            throw new IllegalArgumentException("Needs at least 2 players!");
        }

        if(nbPlayer > 8) {
            throw new IllegalArgumentException("Too many players (max 8)!");
        }

        this.roundCnt = 0;
        this.board = new Board();
        this.dice = new ArrayList<Die>(2);
        this.players = new ArrayList<>(nbPlayer);

        for(int i = 0; i < nbPlayer; ++i) {
            this.players.add(i, new Player("Player#" + i, this.dice, this.board));
        }
    }

    public void playGame() {
        for(roundCnt = 0; roundCnt < MAX_ROUNDS; ++roundCnt) {
            playRound();
        }
    }

    private void playRound() {
        for(Player p : players) {
            p.takeTurn();
        }
    }
}
