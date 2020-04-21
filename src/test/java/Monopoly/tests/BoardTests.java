package Monopoly.tests;

import Monopoly.impl.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTests {
    @Test
    void theFirstSquareShouldBeNamedGO() {
        Board board = new Board();
        String obtained = board.getSquare(0).getName();

        String expected = "GO";

        assertEquals(expected, obtained);
    }

    @Test
    void lastSquareShouldBeNamed39() {
        Board board = new Board();
        String obtained = board.getSquare(39).getName();

        String expected = "Square#39";

        assertEquals(expected, obtained);
    }

    @Test
    void squaresShouldWrapAroundBoard() {
        Board board = new Board();
        String obtained = board.getSquare(41).getName();

        String expected = "Square#1";

        assertEquals(expected, obtained);
    }

}
