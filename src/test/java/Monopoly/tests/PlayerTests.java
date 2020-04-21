package Monopoly.tests;

import Monopoly.impl.Board;
import Monopoly.impl.Die;
import Monopoly.impl.Player;
import Monopoly.impl.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTests {
    Board board;
    Die[] dice;

    @BeforeEach
    void init() {
        board = new Board();
        dice = new Die[] {new Die(), new Die()};
    }

    @Test
    void aPlayerShouldStartInTheStartingSquare() {
        Player player = new Player("Jim", dice, board);
        String obtained = player.getPiece().getLocation().getName();

        assertEquals("GO", obtained);
    }

    @Test
    void aPlayerShouldHaveAName() {
        Player player = new Player("James", dice, board);
        assertNotNull(player.getName());
        assertEquals("James", player.getName());
    }

    @RepeatedTest(100)
    void aPlayerNeverStaysOnTheSameSquare() {
        Player player = new Player("Jake", dice, board);
        Square previousSquare = player.getPiece().getLocation();

        player.takeTurn();
        if(previousSquare == (player.getPiece().getLocation())) {
            fail();
        }
    }
}
