package Monopoly.impl;

public class Piece {
    private String name;
    private Square location;

    public Piece(String name, Square startPosition) {
        this.name = name;
        this.location = startPosition;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
