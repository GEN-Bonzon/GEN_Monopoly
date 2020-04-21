package Monopoly.tests;

import Monopoly.impl.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTests {
    private Board board;

    @BeforeEach
    void boardInit() {
        board = new Board();
    }

    @Test
    void theFirstSquareShouldBeNamedGO() {
        String obtained = board.getSquare(0).getName();

        String expected = "GO";

        assertEquals(expected, obtained);
    }

    @Test
    void lastSquareShouldBeNamed39() {
        String obtained = board.getSquare(39).getName();

        String expected = "Square#39";

        assertEquals(expected, obtained);
    }

    @Test
    void squaresShouldWrapAroundBoard() {
        String obtained = board.getSquare(41).getName();

        String expected = "Square#1";

        assertEquals(expected, obtained);
    }

}
