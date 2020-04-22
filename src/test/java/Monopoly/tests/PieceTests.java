package Monopoly.tests;

import Monopoly.impl.Board;
import Monopoly.impl.Piece;
import Monopoly.impl.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTests {
    Board borad;
    @BeforeEach
    void initBoard() {
        borad = new Board();
    }

    @Test
    void aPieceIsPlacedOnTheDesiredSquare() {
        String expected = "Square#6";
        Square square = borad.getSquare(6);
        Piece piece = new Piece("p1", square);

        assertEquals(expected, piece.getLocation().getName());
    }

    @Test
    void aPieceCanBeMovedToADesiredLocation() {
        String expected = "Jail";
        Square square = borad.getSquare(6);
        Piece piece = new Piece("p1", square);

        piece.setLocation(borad.getSquare(10));

        assertEquals(expected, piece.getLocation().getName());
    }
}
