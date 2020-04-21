package Monopoly.impl;


public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;
    private int cash;

    public Player(String name, Die[] dice, Board board) {
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

        //Check which type of Square the player landed
        piece.getLocation().landedOn(this);
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void addCash(int amount) {
        cash += amount;
    }

    public void reduceCash(int amount) {
        cash -= amount;
    }

    public int getNetWorth() {
        return cash;
    }

    public Board getBoard() {
        return board;
    }
}
