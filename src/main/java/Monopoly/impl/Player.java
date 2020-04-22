package Monopoly.impl;


public class Player {
    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private int cash;

    public Player(String name, Cup cup, Board board) {
        this.name = name;
        this.piece = new Piece("pieceOf" + this.name, board.getSquare(0));
        this.cup = cup;
        this.board = board;
        this.cash = 1500;
    }

    public void takeTurn() {
        //Roll dice
        cup.roll();
        int rollValue = cup.getTotal();

        System.out.print("\t" + name + " a lancé un " + rollValue);

        //Calc new location
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, rollValue);

        //Move to new location
        piece.setLocation(newLoc);

        System.out.println(" et bouge sur la case " + getPiece().getLocation().getName());

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

    @Override
    public String toString() {
        return name + " has " + cash;
    }
}
