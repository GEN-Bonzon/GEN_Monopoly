package Monopoly.impl;

import java.util.ArrayList;

public class Board {
    private final static int MAX_SQUARES = 40;
    private ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>();

        squares.add(0, new Square("GO"));

        for(int i = 1; i < MAX_SQUARES; ++i) {
            squares.add(i, new Square("Square#" + i));
        }
    }

    public Square getSquare(int index) {
        return squares.get(index % squares.size());
    }

    public Square getSquare(Square previousLocation, int moveBy) {
        int prevIndex = squares.indexOf(previousLocation);

        return getSquare(prevIndex + moveBy);
    }
}
