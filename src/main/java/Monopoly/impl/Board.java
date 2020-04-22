package Monopoly.impl;

import java.util.ArrayList;

public class Board {
    private final static int MAX_SQUARES = 40;
    private ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>();

        for(int i = 0; i < MAX_SQUARES; ++i) {
            squares.add(i, new RegularSquare("Square#" + i));
        }

        squares.set(0, new GoSquare("GO"));
        squares.set(10, new RegularSquare("Jail"));
        squares.set(20, new IncomeTaxSquare("Taxes"));
        squares.set(30, new GoToJailSquare("Goto Jail"));
    }

    public Square getSquare(int index) {
        return squares.get(index % squares.size());
    }

    public Square getSquare(Square previousLocation, int moveBy) {
        int prevIndex = squares.indexOf(previousLocation);

        return getSquare(prevIndex + moveBy);
    }
}
