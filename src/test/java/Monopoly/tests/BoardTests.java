package Monopoly.tests;

import Monopoly.impl.Board;
import Monopoly.impl.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tiffany Bonzon
 */
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
    void the10thSquareShouldBeNamedJail() {
        String obtained = board.getSquare(10).getName();

        String expected = "Jail";

        assertEquals(expected, obtained);
    }

    @Test
    void the20thSquareShouldBeNamedTaxes() {
        String obtained = board.getSquare(20).getName();

        String expected = "Taxes";

        assertEquals(expected, obtained);
    }

    @Test
    void the30thSquareShouldBeNamedGotoJail() {
        String obtained = board.getSquare(30).getName();

        String expected = "Goto Jail";

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

    @Test
    void theGetSquareMethodWithOffsetShouldReturnTheCorrectSquare() {
        Square previous = board.getSquare(30);
        String obtained = board.getSquare(previous, 12).getName();

        String expected = "Square#2";

        assertEquals(expected, obtained);
    }
}
