package Monopoly.impl;

import java.util.ArrayList;

/**
 * Represents the board containing the Squares
 * @author Tiffany Bonzon
 */
public class Board {
    private final static int MAX_SQUARES = 40;
    private ArrayList<Square> squares;

    /**
     * Constructor
     */
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

    /**
     * Gets a square on the board
     * @param index The index on the board
     * @return The Square at the specified index on the board
     */
    public Square getSquare(int index) {
        return squares.get(index % squares.size());
    }

    /**
     * Gets a square on the board based on an offset
     * @param previousLocation The previous Square
     * @param moveBy The offset
     * @return The Square at the specified offset on the board
     */
    public Square getSquare(Square previousLocation, int moveBy) {
        int prevIndex = squares.indexOf(previousLocation);

        return getSquare(prevIndex + moveBy);
    }
}
