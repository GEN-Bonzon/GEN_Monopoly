package Monopoly.impl;

import java.util.ArrayList;

public class MonopolyGame {
    private final static int MAX_ROUNDS = 20;

    private int roundCnt;
    private Board board;
    private Die dice[];
    private ArrayList<Player> players;

    public MonopolyGame(int nbPlayer) {
        if(nbPlayer < 2 || nbPlayer > 8) {
            throw new IllegalArgumentException("There should be between 2 and 8 players");
        }

        this.roundCnt = 0;
        this.board = new Board();
        this.dice = new Die[] {new Die(), new Die()};
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

    public int getRoundCnt() {
        return roundCnt;
    }
}
