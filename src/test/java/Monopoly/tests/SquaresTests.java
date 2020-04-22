package Monopoly.tests;

import Monopoly.impl.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquaresTests {
    Cup cup = new Cup(0);
    Board board = new Board();

    @Test
    void landingOnARegularSquareDoesNothing() {
        Player player = new Player("Player", cup, board);
        player.getPiece().setLocation(board.getSquare(6));

        Player expected = player;

        player.getPiece().getLocation().landedOn(player);

        assertSame(expected, player);
    }

    @Test
    void landingOnTheGOSquareGivesThePlayerCash() {
        Player player = new Player("Player", cup, board);
        player.getPiece().setLocation(board.getSquare(6));
        player.getPiece().setLocation(board.getSquare(0));
        player.getPiece().getLocation().landedOn(player);
        int obtained = player.getNetWorth();

        int expected = 1700;

        assertEquals(expected, obtained);
    }

    @Test
    void landingOnTheTaxesSquareTakes200FromFromARichPlayer() {
        Player player = new Player("Player", cup, board);
        player.addCash(6500);
        player.getPiece().setLocation(board.getSquare(20));
        player.getPiece().getLocation().landedOn(player);
        int obtained = player.getNetWorth();

        int expected = 7800;

        assertEquals(expected, obtained);
    }

    @Test
    void landingOnTheTaxesSquareTakes10PercentFromFromAPoorPlayer() {
        Player player = new Player("Player", cup, board);
        player.getPiece().setLocation(board.getSquare(20));
        player.getPiece().getLocation().landedOn(player);
        int obtained = player.getNetWorth();

        int expected = 1350;

        assertEquals(expected, obtained);
    }

    @Test
    void landingOnTheGoToJailSquareShouldSendThePlayerToJail() {
        Player player = new Player("Player", cup, board);
        player.getPiece().setLocation(board.getSquare(30));
        player.getPiece().getLocation().landedOn(player);

        Square expected = board.getSquare(10);

        Square obtained = player.getPiece().getLocation();

        assertSame(expected, obtained);
    }

    @Test
    void theJailSquareShouldBeConsideredARegularSquare() {
        assertTrue(board.getSquare(10) instanceof RegularSquare);
    }
}
