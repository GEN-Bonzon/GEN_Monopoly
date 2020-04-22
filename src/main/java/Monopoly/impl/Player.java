package Monopoly.impl;

/**
 * Represents a Player
 * @author Tiffany Bonzon
 */
public class Player {
    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private int cash;

    /**
     * Constructor
     * @param name The name of the player
     * @param cup The cup containing the dice
     * @param board The Board of the game
     */
    public Player(String name, Cup cup, Board board) {
        this.name = name;
        this.piece = new Piece("pieceOf" + this.name, board.getSquare(0));
        this.cup = cup;
        this.board = board;
        this.cash = 1500;
    }

    /**
     * Player's turn
     */
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

    /**
     * Returns the name of the player
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the Piece of the Player
     * @return the Piece of the Player
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Adds cash to the player's account
     * @param amount The amount to add
     */
    public void addCash(int amount) {
        cash += amount;
    }

    /**
     * Removes cash from the player's account
     * @param amount The amount to deduce
     */
    public void reduceCash(int amount) {
        cash -= amount;
    }

    /**
     * Returns the player's networth
     * @return the player's networth
     */
    public int getNetWorth() {
        return cash;
    }

    /**
     * Returns the Board
     * @return the Board
     */
    public Board getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return name + " has " + cash;
    }
}
