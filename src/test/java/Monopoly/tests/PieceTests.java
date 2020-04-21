package Monopoly.tests;

import Monopoly.impl.Piece;
import Monopoly.impl.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTests {
    @Test
    void aPieceIsPlacedOnTheDesiredSquare() {
        String expected = "s1";
        Square square = new Square(expected);
        Piece piece = new Piece("p1", square);

        assertEquals(expected, piece.getLocation().getName());
    }

    @Test
    void aPieceCanBeMovedToADesiredLocation() {
        String expected = "s21";
        Square square = new Square("s1");
        Piece piece = new Piece("p1", square);

        piece.setLocation(new Square (expected));

        assertEquals(expected, piece.getLocation().getName());
    }
}
