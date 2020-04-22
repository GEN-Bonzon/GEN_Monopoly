package Monopoly.impl;

/**
 * Represents a Piece
 * @author Tiffany Bonzon
 */
public class Piece {
    private String name;
    private Square location;

    /**
     * Construtor
     * @param name the name of the piece
     * @param startPosition the starting position
     */
    public Piece(String name, Square startPosition) {
        this.name = name;
        this.location = startPosition;
    }

    /**
     * Returne the Square on which the Piece is
     * @return the Square on which the Piece is
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Sets the location of the Piece
     * @param location A Square on the Board
     */
    public void setLocation(Square location) {
        this.location = location;
    }
}
