package Monopoly.tests;

import Monopoly.impl.Board;
import Monopoly.impl.Piece;
import Monopoly.impl.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tiffany Bonzon
 */
public class PieceTests {
    Board board;

    @BeforeEach
    void initBoard() {
        board = new Board();
    }

    @Test
    void aPieceIsPlacedOnTheDesiredSquare() {
        String expected = "Square#6";
        Square square = board.getSquare(6);
        Piece piece = new Piece("p1", square);

        assertEquals(expected, piece.getLocation().getName());
    }

    @Test
    void aPieceCanBeMovedToADesiredLocation() {
        String expected = "Jail";
        Square square = board.getSquare(6);
        Piece piece = new Piece("p1", square);

        piece.setLocation(board.getSquare(10));

        assertEquals(expected, piece.getLocation().getName());
    }
}
