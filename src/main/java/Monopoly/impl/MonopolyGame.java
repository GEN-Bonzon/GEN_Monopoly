package Monopoly.impl;

import java.util.ArrayList;

public class MonopolyGame {
    private final static int NB_ROUNDS = 20;

    private int roundCnt;
    private Board board;
    private Cup cup;
    private ArrayList<Player> players;

    public MonopolyGame(int nbPlayer) {
        if(nbPlayer < 2 || nbPlayer > 8) {
            throw new IllegalArgumentException("There should be between 2 and 8 players");
        }

        this.roundCnt = 0;
        this.board = new Board();
        this.cup = new Cup(2);
        this.players = new ArrayList<>(nbPlayer);

        for(int i = 0; i < nbPlayer; ++i) {
            this.players.add(i, new Player("Player#" + i, this.cup, this.board));
        }

        System.out.println("Création de la game avec " + nbPlayer + " players");
    }

    public void playGame() {
        System.out.println("-------- Début des rounds --------");
        for(roundCnt = 0; roundCnt < NB_ROUNDS; ++roundCnt) {
            System.out.println("Round#" + roundCnt);
            playRound();
        }

        System.out.println("-------- Fin des rounds --------");
        for (Player p: players) {
            System.out.println(p);
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

    public int getPlayersCnt() {
        return players.size();
    }
}
