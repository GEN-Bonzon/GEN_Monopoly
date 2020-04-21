package Monopoly.impl;


import java.util.ArrayList;

public class Player {
    private String name;
    private Piece piece;
    private ArrayList<Die> dice;
    private Board board;

    Player(String name, ArrayList<Die> dice, Board board) {
        this.name = name;
        this.piece = new Piece("pieceOf" + this.name, board.getSquare(0));
        this.dice = dice;
        this.board = board;
    }

    public void takeTurn() {
        int rollValue = 0;

        //Roll dice
        for(Die d : dice) {
            d.roll();
            rollValue += d.getFaceValue();
        }

        //Calc new location
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, rollValue);

        //Move to new location
        piece.setLocation(newLoc);
    }
}
