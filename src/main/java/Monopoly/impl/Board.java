package Monopoly.impl;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares = new ArrayList<>(40);

    Board() {
        squares.add(0, new Square("GO"));

        for(int i = 1; i < squares.size(); ++i) {
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
